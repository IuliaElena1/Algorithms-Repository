package shortWay;

import java.util.ArrayList;
import java.util.List;

public class Traseu {
	private List<City> cityes = new ArrayList<>();

	public void add(City startCity) {
		cityes.add(startCity);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityes == null) ? 0 : cityes.hashCode());
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
		Traseu other = (Traseu) obj;
		if (cityes == null) {
			if (other.cityes != null)
				return false;
		} else if (!cityes.equals(other.cityes))
			return false;
		return true;
	}

	public boolean contains(City startCity) {
		if (cityes.contains(startCity)) {
			return true;
		}
		return false;

	}

	public void show() {
		System.out.println(cityes.toString());
	}
}