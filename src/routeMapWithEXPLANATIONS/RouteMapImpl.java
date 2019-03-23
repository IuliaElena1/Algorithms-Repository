package routeMapWithEXPLANATIONS;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class RouteMapImpl implements RouteMap {

	// avem o lista de orase in care fiecare oras iti tine in el legaturile pe care
	// le are cu celelalte orase prin Map<City,Integer> care reprezinta un vecin al
	// orasului
	// adica !fiecare oras isi stie vecinii si distanta pana la ei

	private List<City> cities = new ArrayList<>();
	private Route minRoute = null;

	// adaugarea rutei presupune ca orasului Bucuresti ii adauga un element in Mapul
	// cu vecinii adaica catre Craiova si distanta iar
	// Craiovei ii adaug Bucurestiul cu aceeasi distanta

	// pentru adaugarea unei rute avem nevoie sa stim orasul de unde pornim,orasul
	// de oprire si distanta dintre cele doua orase

	// primim ca parametru un String iar din acest String trebuie sa obtinem un
	// obiect cu care sa putem lucra
	@Override
	public void addRoute(String from, String to, int distance) {

		City startCity = convertAstringInAnObject(from);
		City stopCity = convertAstringInAnObject(to);

		if (startCity == null) { // primul city este null adica nu se gaseste in lista deci creem un obiect
			startCity = new City(from); // si il adaugam la lista
			cities.add(startCity);
		}

		if (stopCity == null) {
			stopCity = new City(to);
			cities.add(stopCity);
		}

		// DUPA CE AM ADAUGAT ORASELE IN LISTA TREBUIE SA FACEM REFERIRE SI LA DISTANTA
		// DINRE ELE PRIN PUNEREA IN MAP a vecinuluisi distanta pana la orasul de
		// pornire
		startCity.addReferenceToNeighour(stopCity, distance);
		stopCity.addReferenceToNeighour(startCity, distance);

	}

	// verificam daca Stringul nameCity se afla in lista de orase pe care vrem sa o
	// parcurem
	// pentru ca primim o lista goala cu orase primul nume de oras cu veceinul
	// aferent nu se va gasi in lista de city deci metoda
	// va reintoarce null >> in caz contrar returnam city-ul

	// returnam obiectul corespunzator Stringului ,din lista de orase
	private City convertAstringInAnObject(String nameCity) {
		for (City city : cities) {
			if (city.hasName(nameCity)) {
				return city;
			}

		}
		return null; // daca nu am gasit orasul returnam null
	}

	// presupunem ca Stringurile From si to exista in lista cu orase
	// Trebuie sa tinem ruta curenta intr-un obiect iar pt asta facem o clasa Route
	// care contine o lista de orase

	@Override
	public void showRoute(String from, String to) {
		City startCity = convertAstringInAnObject(from);
		City stopCity = convertAstringInAnObject(to);

		// Clasa Route contine o lista de rute iar noi ne setam o ruta curenta
		Route curentRoute = new Route();

		// metoda finde Valid Route afiseaza ruta cand gaseste un drum valid
		// ruta curenta merge din apel recursiv in alt apel recursiv

		// start City =este orasul pe care il caut

		findValidRoute(curentRoute, startCity, stopCity);
		minRoute.showRoute();

	}

	// Consideram ruta:
	// Bucutesti >> vecinii Craiova+Pitesti ;
	// Pitesti >>vecinii :Bucuresti ,Sibiu,Craiova
	// Sibiu >>vecinii : Pitesti, TM
	// Timisoara>> vecinii : Craiova , Sibiu

	// metoda findeValidRoute afiseaza ruta cand gaseste un drum valid
	// IN RUTA CURENTA TREBUIE SA ADAUG NODUL STARTCITY : DE UNDE PORNESC

	private void findValidRoute(Route curentRoute, City startCity, City stopCity) {

		// metoda ADD CURENT CITY(STARTCITY) se face daca nu am deja orasul in ruta
		// curenta adica daca din Timisoara vreau sa merg la Sibiu,ajung in Sibiu
		// si apoi vreau sa merg in toti vecinii Sibiului iar asta ar insemna sa ma
		// reintorc in Timisoara ceea ce nu vreau,ci
		// trebuie sa merg in urmatorul vecin al Sibiului,adica un oras prin care nu am
		// mai trecut ajungand la Timisoara.
		// Pentru a evita sa trec iar in orasul Timisoara evit prin urmatoarea metoda:

		if (curentRoute.containsCurentRoute(startCity)) {
			return;
		}

		// dc ruta curenta nu contine nodul startCity il adaug la ruta

		curentRoute.addCurentCity(startCity);

		if (stopCity.equals(startCity)) {

			// daca start==stop inseamna ca am ajuns la destinatie si afisam solutia sau
			// rutaCurenta

			curentRoute.showRoute();

			// urmeaza afisarea rutei minime
			// intotdeauna verificarea dc min route== null se pune la inceputul if-ului
			// minRounte==NULL >> INSEAMNA CA NU AVEM NICI O RUTA MINIMIA
			// minRoute nu poate fi egal cu curent route pentru ca intotdeauna ruta curenta
			// ar fi cea minima de aceea trebuie sa clonam
			// minRouteul pt a ramane memorat de fieare data cand se merge recursvi

			// clone() se implementeaza in clasa Route

			if (minRoute == null || minRoute.getLenghtOfRoute() > curentRoute.getLenghtOfRoute()) {
				try {
					minRoute = (Route) curentRoute.clone(); //// clonam ruta curenta
				} catch (Exception e) {

					e.printStackTrace();
				}
			}

		} else

		{
			// daca nu am ajuns la destinatie trebuie sa mergem in toti vecinii lui
			// startCity iterand pe Map
			// metoda entrySet() returneaza un entry = este o pereche keie-valoare din mapul
			// Map>Citu,Integer>Neighbours

			for (Entry<City, Integer> entry : startCity.getNeighbours().entrySet()) {

				findValidRoute(curentRoute, entry.getKey(), stopCity);

				// entry.getKey() : se iau doar numele vecinilor fara distanta mai precis keile
				// metoda reprez incercarea de a gasi un drum de la vecin la destiatie pt
				// fiecare nod/oras

			}

		}

		// dupa terminarea apelului recursiv se sterge ultimul curentRoute,acesta urmand
		// sa ia o noua valoare

		curentRoute.removeLast();

	}

	public static void main(String[] args) {
		RouteMapImpl routeMap = new RouteMapImpl();
		routeMap.addRoute("Timisoara", "Lugoj", 40);
		routeMap.addRoute("Timisoara", "Buzias", 25);
		routeMap.addRoute("Buzias", "Lugoj", 20);
		routeMap.addRoute("Caransebes", "Lugoj", 42);
		routeMap.addRoute("Caransebes", "Hateg", 80);
		routeMap.addRoute("Hunedoara", "Hateg", 20);
		routeMap.addRoute("Hunedoara", "Deva", 15);
		routeMap.addRoute("Lugoj", "Deva", 90);
		routeMap.addRoute("Arad", "Deva", 120);
		routeMap.addRoute("Arad", "Timisoara", 45);
		// System.out.println(routeMap.cities);
		routeMap.showRoute("Timisoara", "Deva");

	}
}
