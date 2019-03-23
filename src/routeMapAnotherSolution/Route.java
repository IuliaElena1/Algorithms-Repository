
package routeMapAnotherSolution;

import java.util.ArrayList;
import java.util.List;

public class Route {
	private List<City> route = new ArrayList<City>();

	public Route(ArrayList route) {
		this.route = route;
	}

	public Route() {
	}

	public boolean contains(City city) {
		return route.contains(city);
	}

	public void addCity(City city) {
		route.add(city);
	}

	public void removeLast() {
		route.remove(route.size() - 1);
	}

	@Override
	public String toString() {
		String result = "";

		for (City city : route) {
			result += (result.length() == 0 ? "" : "-") + city;
		}

		return result;
	}

	public int getDistance() {
		int sum = 0;
		for (int i = 1; i < route.size(); i++) {
			City from = route.get(i - 1);
			City to = route.get(i);
			sum += from.getDistanceTo(to);
		}
		return sum;
	}

	public Route clone() {
		return new Route(new ArrayList<>(route));
	}
}
