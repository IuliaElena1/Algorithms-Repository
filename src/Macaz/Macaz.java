/*
 * Copyright (c) 2019 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package Macaz;

import java.util.Arrays;

public class Macaz {

	private String idMacaz;
	private Linie linieSursa;
	private Linie[] linieDestinatie;

	public Macaz(Object idMacaz) {
		super();
		this.idMacaz = idMacaz.toString();

	}

	public Macaz(String idMacaz) {
		super();
		this.idMacaz = idMacaz;
	}

	public Macaz() {

	}

	public boolean isInList(String idName) {
		return this.idMacaz.equals(idName);

	}

	public String getIdMacaz() {
		return idMacaz;

	}

	public Linie getLinieSursa() {
		return linieSursa;
	}

	public Linie[] getLinieDestinatie() {
		return linieDestinatie;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMacaz == null) ? 0 : idMacaz.hashCode());
		result = prime * result + Arrays.hashCode(linieDestinatie);
		result = prime * result + ((linieSursa == null) ? 0 : linieSursa.hashCode());
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
		Macaz other = (Macaz) obj;
		if (idMacaz == null) {
			if (other.idMacaz != null)
				return false;
		} else if (!idMacaz.equals(other.idMacaz))
			return false;
		if (!Arrays.equals(linieDestinatie, other.linieDestinatie))
			return false;
		if (linieSursa == null) {
			if (other.linieSursa != null)
				return false;
		} else if (!linieSursa.equals(other.linieSursa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return idMacaz;
	}

}
