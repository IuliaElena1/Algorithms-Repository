package shortWay;

import java.util.HashMap;
import java.util.Map;

public class City {

	private String name;
	private Map<City, Integer> nearByCity = new HashMap<City, Integer>();

	public City(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public Map<City, Integer> getNearByCity() {
		return nearByCity;
	}

	public void addRouteNearByCity(City nameCity, int distance) {

		nearByCity.put(nameCity, distance);
	}

	public boolean containsNameCity(String nameCity) {

		if (this.name.equals(nameCity)) {
			return true;

		}
		return false;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		City other = (City) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int displayDistance(City stop) {

		return nearByCity.get(stop);
	}

}
