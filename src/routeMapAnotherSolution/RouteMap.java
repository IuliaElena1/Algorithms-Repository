
package routeMapAnotherSolution;

public interface RouteMap {
	public void addRoute(String from, String to, int distance);

	public int getShortestDistance(String from, String to);

	/**
	 * Calea se returneaza sub forma: Timisoara-Lugoj-Deva-Hunedoara Atentie, fara
	 * spatii!!!
	 */
	public String getShortestPath(String from, String to);
}
