package shortWay;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class RouteMapImpl implements RouteMap {

	private List<City> allCitiesComposeRoute = new ArrayList<>();

	@Override
	public void addRoute(String from, String to, int distance) {

		City startCity = isStringCityInListCityes(from);
		City stopCity = isStringCityInListCityes(to);

		if (startCity == null) {
			startCity = new City(from);
			allCitiesComposeRoute.add(startCity);
		}
		if (stopCity == null) {
			stopCity = new City(to);
			allCitiesComposeRoute.add(stopCity);
		}

		startCity.addRouteNearByCity(stopCity, distance);
		stopCity.addRouteNearByCity(startCity, distance);

	}

	public City isStringCityInListCityes(String nameCity) {
		for (City city : allCitiesComposeRoute) {
			if (city.containsNameCity(nameCity)) {
				return city;
			}
		}
		return null;
	}

	@Override
	public int getShortestDistance(String from, String to) {
		List<City> shortDistances = new ArrayList<City>();

		Route curentCityRoute = new Route();

		City startCity = isStringCityInListCityes(from);
		City stopCity = isStringCityInListCityes(to);

		// afisam ruta cnd gasim un drum valid
		getRouteFromCity(curentCityRoute, startCity, stopCity);
		// return 0;
		return 0;

	}

	public void getRouteFromCity(Route curentCityRoute, City from, City to) {

		List<Route> shortDistances = new ArrayList<>();

		// dc ruta curenta contine orasul from mergi mai departe
		// evitam buclele
		if (curentCityRoute.containsCity(from)) {

		}

		// in ruta curenta adaug nodul de unde pornesc dc in ruta curenta nu exista
		// orasul from
		curentCityRoute.addCity(from);

		// from == to :am parcurs ruta pana la destinatie si am ajuns la nodul stopCity
		if (from == to) {
			curentCityRoute.printRoute();

		}
		// daca nu am ajuns la nodul curent mergem in toti vecinii lui from :
		// from.getNearByCity
		// entry : pereche cheie valoare din Map<City,Integer>
		// iteram de fiecare entry pana gasim un drum de la vecin la destinatie
		else {
			for (Entry<City, Integer> entrySet : from.getNearByCity().entrySet()) {
				getRouteFromCity(curentCityRoute, entrySet.getKey(), to);

			}
		}

		// orice add trebuie sa aiba si un remouve din solutie
		curentCityRoute.removeLast();

	}

	@Override
	public String getShortestPath(String from, String to) {

		return null;
	}

	public static void main(String[] args) {
		RouteMapImpl rm = new RouteMapImpl();
		rm.addRoute("Timisora", "Deva", 150);
		rm.addRoute("Timisora", "Hunedoara", 120);
		rm.addRoute("Deva", "Hunedoara", 16);
		rm.addRoute("Timisora", "Lugoj", 60);
		rm.addRoute("Lugoj", "Deva", 100);
		rm.addRoute("Lugoj", "Hunedoara", 117);
		rm.printCities();

		// rm.getShortestDistance("Timisoara", "Deva");

	}

	public void printCities() {
		System.out.println(allCitiesComposeRoute);
	}

}
