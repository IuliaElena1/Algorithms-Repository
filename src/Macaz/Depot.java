
package Macaz;

/*
 * Copyright (c) 2013 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

/**
 * @author <a href="mailto:Veina@ssi-schaefer-noell.com">Veina</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public interface Depot {
	/**
	 * Add a line to the system
	 * 
	 * @param id
	 * @return a reference that identifies the newly created line
	 */
	public Object addLine(String id);

	/**
	 * Add a switch to the system
	 * 
	 * @param id
	 * @return a reference that identifies the newly created switch
	 */
	public Object addSwitch(String id);

	/**
	 * Sets a connection for the mid switch from source line to the dest array of
	 * possible destinations
	 * 
	 * @param mid
	 * @param source
	 * @param dest
	 */
	public void setConnections(Object mid, Object source, Object[] dest);

	/**
	 * Displays the solution containing all the possible paths from start line to
	 * the stop line
	 * 
	 * @param start
	 * @param stop
	 */
	public void showPath(Object start, Object stop);

	/**
	 * @param start
	 * @param stop
	 */
	void switchTrains(Object start, Object stop);
}
