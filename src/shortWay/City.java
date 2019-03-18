package shortWay;

import java.util.HashMap;
import java.util.Map;

public class City {

	private String name;
	private Map<City, Integer> vecinii = new HashMap<>();

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

	public boolean containName(String nameCity) {

		if (this.name.equals(nameCity)) {
			return true;
		}
		return false;
	}

	public void adaugaLegaturaCuCity(City fromCity, int km) {
		vecinii.put(fromCity, km);

	}

	public Map<City, Integer> getVecinii() {
		return vecinii;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((vecinii == null) ? 0 : vecinii.hashCode());
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
		if (vecinii == null) {
			if (other.vecinii != null)
				return false;
		} else if (!vecinii.equals(other.vecinii))
			return false;
		return true;
	}

}
