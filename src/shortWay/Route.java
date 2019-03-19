package shortWay;

import java.util.ArrayList;
import java.util.List;

public class Route {

	private List<City> allCitiesComposeRoute = new ArrayList<City>();

	public Route() {
		super();
		this.allCitiesComposeRoute = allCitiesComposeRoute;
	}

	public Route(List<City> allCitiesComposeRoute) {
		super();
		this.allCitiesComposeRoute = allCitiesComposeRoute;
	}

	public List<City> getAllCitiesComposeRoute() {
		return allCitiesComposeRoute;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allCitiesComposeRoute == null) ? 0 : allCitiesComposeRoute.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Route other = (Route) obj;
		if (allCitiesComposeRoute == null) {
			if (other.allCitiesComposeRoute != null)
				return false;
		} else if (!allCitiesComposeRoute.equals(other.allCitiesComposeRoute))
			return false;
		return true;
	}

	public void addCity(City from) {
		allCitiesComposeRoute.add(from);

	}

	public boolean containsCity(City cityName) {
		if (allCitiesComposeRoute.contains(cityName)) {
			return true;
		}
		return false;

	}

	public void printRoute() {
		System.out.println(allCitiesComposeRoute.toString() + "->" + getLenghtRoute());
	}

	public int getLenghtRoute() {
		int sum = 0;
		for (int i = 0; i < allCitiesComposeRoute.size() - 1; i++) {
			City start = allCitiesComposeRoute.get(i);
			City stop = allCitiesComposeRoute.get(i + 1);

			sum += start.displayDistance(stop);
		}

		return sum;
	}

	// sterge ultimul element din lista
	public void removeLast() {
		allCitiesComposeRoute.remove(allCitiesComposeRoute.size() - 1);
	}
}