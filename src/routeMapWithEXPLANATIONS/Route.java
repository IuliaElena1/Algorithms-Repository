package routeMapWithEXPLANATIONS;

import java.util.ArrayList;
import java.util.List;

public class Route implements Cloneable {

	// cities = orasele care compun ruta practic o succesiune de oras care compun
	// ruta: ex Timisoara-Craiova-Pitesti-Bucuresti

	private List<City> cities = new ArrayList<>();

	public Route() {
		super();
	}

	public Route(List<City> cities) {
		super();
		this.cities = cities;
	}

	// adauga in ruta curenta nodul sau orasul de unde pornesc din lista de rute
	public void addCurentCity(City nameCityStart) {

		cities.add(nameCityStart);

	}

	public boolean containsCurentRoute(City nameCity) {
		if (cities.contains(nameCity)) { // dc numele parametru se gaseste in lista de orase care compun ruta
			return true;
		}

		return false;
	}

	public void showRoute() {
		System.out.println(cities.toString() + " ->  " + getLenghtOfRoute() + "km");

		// solutia daca am ajuns la destinatie + lungimea rutei

	}

	// stim Ruta :Timisoara-Buzias-Arad-Deva iar pt fiecare segment obtinem lungimea
	// si o adaugam la o suma
	// avem 3 segmente practic 3 noduri

	public int getLenghtOfRoute() {
		int sum = 0;

		for (int i = 0; i < cities.size() - 1; i++) {
			// definesc un segment
			City startCity = cities.get(i);
			City stopCity = cities.get(i + 1);

			sum += startCity.getDistance(stopCity);
			// din orasul startCity vreau sa aflu distanta pana la stopCity

		}

		return sum;
	}

	// stergem ultimul element din lista
	public void removeLast() {
		cities.remove(cities.size() - 1);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// construim un obiect clone de tip route iarapoi setez o copie a
		// listei de orase

		Route clone = new Route();
		clone.cities = new ArrayList<>(cities); // clone.cities = creeaza o copie a listei de orase
		return clone();
	}

}
