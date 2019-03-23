/*
 * Copyright (c) 2019 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package Macaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DepotImpl implements Depot {
	private List<Macaz> macaze = new ArrayList<Macaz>();

	// private List<Macaz> conectionsSolutions = new ArrayList<Macaz>();
	private List<Linie> linii = new ArrayList<>();
	private List<Path> solutions = new ArrayList<>();
	private Path paths = new Path();

	@Override
	public Object addLine(String id) {

		Linie linie = switchLineStringInAnObject(id);

		if (linie == null) {
			linie = new Linie(id);
			linii.add(linie);
			return linie;

		}

		return null;

	}

	public Linie switchLineStringInAnObject(String idLine) {
		for (Linie linie : linii) {
			if (linie.isLineOf(idLine)) {

				return linie;
			}

		}
		return null;

	}

	@Override
	public Object addSwitch(String id) {

		Macaz macaz = switchStringInAMacazObject(id);

		if (macaz == null) {
			macaz = new Macaz(id);
			macaze.add(macaz);
			return macaze;
		}

		return null;

	}

	private Macaz switchStringInAMacazObject(String idMacaz) {

		for (Macaz macaz : macaze) {
			if (macaz.isInList(idMacaz)) {
				return macaz;
			}
		}
		return null;
	}

	@Override
	public void setConnections(Object mid, Object source, Object[] dest) {

		Linie[] destinatie = new Linie[dest.length];
		int indexDestinatie = 0;

		Macaz macaz = new Macaz(mid);
		Linie linieSursa = new Linie(source);

		for (int i = 0; i < dest.length; i++) {
			destinatie[indexDestinatie] = (Linie) dest[i];
			indexDestinatie++;
		}
		System.out.println("Macazul " + macaz + ": " + "linie sursa: " + linieSursa.toString() + ", "
				+ "linii destinatii: " + Arrays.deepToString(destinatie));

	}

	@Override
	public void showPath(Object start, Object stop) {

		Macaz curent = connectionPath(start, stop);
		System.out.println(curent);

	}

	private Macaz connectionPath(Object start, Object stop) {

		Macaz linieStart = new Macaz(start);
		Macaz linieStop = new Macaz(stop);
		Path curentPath = new Path();
		solutions.clear();

		search(linieStart, linieStop, curentPath);

		return null;
	}

	private void search(Macaz start, Macaz stop, Path curentPath) {

		if (solutions.contains(curentPath)) {
			return;
		}

		((Path) solutions).addPath((Map<Macaz, Linie[]>) curentPath);

		/*
		 * if (curentPath.equals(stop)) { solutions.add((Path) ((Object)
		 * solutions).clone()); }
		 */

	}

	private Path getPath(Object start, Object stop) {
		/*
		 * Linie linieSursa = new Linie(start); Linie linieStop = new Linie(stop);
		 * 
		 * 
		 * if(solutions.contains(linieSursa)) { return; }
		 * 
		 * solutions.add
		 */
		return null;
	}

	@Override
	public void switchTrains(Object start, Object stop) {

	}

	public static void main(String[] args) {

		DepotImpl dp = new DepotImpl();

		// dp.addLine("l3");

		Object m1 = dp.addSwitch("m1");
		Object l1 = dp.addLine("L1");
		Object l5 = dp.addLine("l6");
		Object l2 = dp.addLine("l3");
		// Object[] l3 = new Object[l2,l5];

		System.out.println(m1);
		System.out.println(l1);
		System.out.println(l5);
		dp.setConnections(m1, l1, new Object[] { l2, l5 });

	}

}
