package routeMapWithEXPLANATIONS;

public interface RouteMap {
	public void addRoute(String from, String to, int distance);

	/**
	 * Calea se returneaza sub forma: Timisoara-Lugoj-Deva-Hunedoara Atentie, fara
	 * spatii!!!
	 */
	public void showRoute(String from, String to);
}
