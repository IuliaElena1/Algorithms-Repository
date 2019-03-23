
package routeMapAnotherSolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RouteImpl implements RouteMap {
	private List<City> cities = new ArrayList<City>();
	private List<Route> solutions = new ArrayList<Route>();

	@Override
	public void addRoute(String from, String to, int distance) {
		City fromCity = getCityByName(from);
		City toCity = getCityByName(to);
		if (fromCity == null) {
			fromCity = new City(from);
			cities.add(fromCity);
		}
		if (toCity == null) {
			toCity = new City(to);
			cities.add(toCity);
		}
		fromCity.addNeighbour(toCity, distance);
		// toCity.addNeighbour(fromCity, distance);

	}

	private City getCityByName(String name) {
		for (City city : cities) {
			if (city.hasName(name)) {
				return city;
			}
		}
		return null;
	}

	@Override
	public int getShortestDistance(String from, String to) {
		Route shortestRoute = getShortestRoute(from, to);
		return shortestRoute.getDistance();
	}

	@Override
	public String getShortestPath(String from, String to) {
		Route shortestRoute = getShortestRoute(from, to);
		return shortestRoute.toString();
	}

	private Route getShortestRoute(String from, String to) {
		City fromCity = getCityByName(from);
		City toCity = getCityByName(to);
		Route currentSolution = new Route();
		solutions.clear();

		search(fromCity, toCity, currentSolution);

		return getMinimumSolution(solutions);
	}

	private Route getMinimumSolution(List<Route> solutions) {

		Route minimRoute = null;
		for (int i = 0; i < solutions.size(); i++) {
			if (minimRoute == null || minimRoute.getDistance() > solutions.get(i).getDistance()) {
				minimRoute = solutions.get(i);
			}
		}

		return minimRoute;
	}

	private void search(City current, City finish, Route solution) {
		// evitam buclele
		if (solution.contains(current)) {
			return;
		}

		// adaugam orasul curent la drumul curent
		solution.addCity(current);

		// daca am ajuns la solutie
		if (current.equals(finish)) {
			// am ajuns la solutie
			System.out.println(solution);
			System.out.println(solution.getDistance());
			solutions.add(solution.clone());

		} else {
			Map<City, Integer> neighbours = current.getNeighbours();
			for (City neighbour : neighbours.keySet()) {
				search(neighbour, finish, solution);
			}
		}

		// foarte important stergem punctul adaugat cu add
		solution.removeLast();

	}

	public static void main(String[] args) {
		RouteImpl routeMap = new RouteImpl();
		routeMap.addRoute("Timisoara", "Lugoj", 40);
		routeMap.addRoute("Timisoara", "Buzias", 25);
		routeMap.addRoute("Buzias", "Lugoj", 20);
		routeMap.addRoute("Caransebes", "Lugoj", 40);
		routeMap.addRoute("Caransebes", "Hateg", 80);
		routeMap.addRoute("Hunedoara", "Hateg", 20);
		routeMap.addRoute("Hunedoara", "Deva", 15);
		routeMap.addRoute("Lugoj", "Deva", 90);
		routeMap.addRoute("Arad", "Deva", 120);
		routeMap.addRoute("Arad", "Timisoara", 45);

		System.out.println(routeMap.getShortestPath("Timisoara", "Caransebes"));
	}
}
