/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package com.ssn.ssijs.tests.routemap;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author <a href="mailto:rveina@ssi-schaefer-noell.com">rveina</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public class RouteMapTest {
  RouteMap routeMap = new RouteImpl();

  {
    routeMap = new RouteImpl();
    routeMap.addRoute("Timisoara", "Lugoj", 40);
    routeMap.addRoute("Timisoara", "Buzias", 25);
    routeMap.addRoute("Buzias", "Lugoj", 20);
    routeMap.addRoute("Caransebes", "Lugoj", 40);
    routeMap.addRoute("Caransebes", "Hateg", 80);
    routeMap.addRoute("Hunedoara", "Hateg", 20);
    routeMap.addRoute("Hunedoara", "Deva", 15);
    routeMap.addRoute("Lugoj", "Deva", 90);
    routeMap.addRoute("Arad", "Deva", 120);
    routeMap.addRoute("Arad", "Timisoara", 45);
  }

  @Test
  public void testTMHD1() {
    assertEquals(145, routeMap.getShortestDistance("Timisoara", "Hunedoara"));
  }

  @Test
  public void testTMHD2() {
    assertEquals("Timisoara-Lugoj-Deva-Hunedoara", routeMap.getShortestPath("Timisoara", "Hunedoara"));
  }

  @Test
  public void testHDTM1() {
    assertEquals(145, routeMap.getShortestDistance("Hunedoara", "Timisoara"));
  }

  @Test
  public void testHDTM2() {
    assertEquals("Hunedoara-Deva-Lugoj-Timisoara", routeMap.getShortestPath("Hunedoara", "Timisoara"));
  }

  @Test
  public void testARCS1() {
    assertEquals(125, routeMap.getShortestDistance("Arad", "Caransebes"));
  }

  @Test
  public void testARCS() {
    assertEquals("Arad-Timisoara-Lugoj-Caransebes", routeMap.getShortestPath("Arad", "Caransebes"));
  }

}
