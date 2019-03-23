
package routeMapWithEXPLANATIONS;

import java.util.HashMap;
import java.util.Map;

public class City {
	// parametrii:
	// - un nume de oras
	// -Map care reprezinta vecinii adica un alt oras + distanta pana la acel oras
	// pentru a functiona Map-ul si Hash Mapul corect trebuie generat equals si hash
	// dupa nume : doua orase sunt egale dc au acelasi nume
	// code in aceasta clasa

	private String name;
	private Map<City, Integer> neighbours = new HashMap<>();

	public City(String name) {
		super();
		this.name = name;
	}

	public String getName() {

		return name;
	}

	public Map<City, Integer> getNeighbours() {
		return neighbours;
	}

	public boolean hasName(String nameCity) {
		if (this.name.equals(nameCity)) {
			return true;
		}
		return false;
	}

	public void addReferenceToNeighour(City cityNeighbout, int distance) {
		neighbours.put(cityNeighbout, distance);
	}

	public int getDistance(City stopCity) {

		return neighbours.get(stopCity).intValue();

		// Afiseaza distanta de la un oras la orasul stopCity
		// neighbour.get(ObjectKey)
	}

	@Override
	public String toString() {
		return name;
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

}
