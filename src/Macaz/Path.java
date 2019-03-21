package Macaz;

import java.util.HashMap;
import java.util.Map;

public class Path {

	private Map<Macaz, Linie[]> route = new HashMap<>();
	private Linie[] linieRoute;
	private Macaz macaz;

	public Path(Linie[] linieRoute, Macaz curent) {
		super();
		this.route = route;
		this.linieRoute = linieRoute;
	}

	public Path() {
	}

	public Path(Map<Macaz, Linie[]> route) {
		this.route = route;
	}

	public Macaz getCurent() {
		return macaz;
	}

	public void addPath(Map<Macaz, Linie[]> route) {
		route.put(macaz, linieRoute);

	}

	public Path clone() {
		return new Path(new HashMap<>(route));
	}

}
