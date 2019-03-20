/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: /data/cvs/Scolarizare/cpopa/mpo_test11/src/com/ssn/ssijs/tests/path/RouteMap.java,v 1.1 2019/03/19 10:23:43 cpopa Exp $
 */

package MapApplication;

/**
 * @author <a href="mailto:rveina@ssi-schaefer-noell.com">rveina</a>
 * @version $Revision: 1.1 $, $Date: 2019/03/19 10:23:43 $, $Author: cpopa $
 */

public interface RouteMap {
  public void addRoute(String from, String to, int distance);

  public int getShortestDistance(String from, String to);

  /**
   * Calea se returneaza sub forma:
    Timisoara-Lugoj-Deva-Hunedoara
    Atentie, fara spatii!!! 
   */
  public String getShortestPath(String from, String to);
}
