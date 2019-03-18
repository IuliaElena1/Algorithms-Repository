package shortWay;

import java.util.ArrayList;
import java.util.List;

public class Harta {

	List<City> cityesList = new ArrayList<>();

	public static void main(String[] args) {

		Harta ht = new Harta();
		ht.adaugaTraseu("Galati", "Bucuresti", 240);
		ht.adaugaTraseu("Galati", "Buzau", 150);
		ht.adaugaTraseu("Galati", "Braila", 20);
		ht.adaugaTraseu("Bucuresti", "Ploiesti", 70);
		ht.adaugaTraseu("Bucuresti", "Mizil", 120);
		ht.adaugaTraseu("Buzai", "Bucuresti", 100);

		ht.showCityes();
		ht.afiseazaTraseul("Galati", "Bucuresi");
	}

	public void showCityes() {
		System.out.println(cityesList);
	}

	public void afiseazaTraseul(String startCity, String stopCity) {
		City fromCity = printCityByName(startCity);
		City toCity = printCityByName(stopCity);

		Traseu traseuCurent = new Traseu();

		gasesteRuta(traseuCurent, fromCity, toCity);

	}

	private void gasesteRuta(Traseu traseuCurent, City startCity, City stopCity) {

		
		if(traseuCurent.contains(startCity)) {
			return;
		}
		traseuCurent.add(startCity);
		
		if(startCity.equals(stopCity)) {
			traseuCurent.show();
		}
		else {
			for( startCity.getVecinii())
		}
	}

	public void adaugaTraseu(String startCity, String stopCity, int km) {

		City fromCity = printCityByName(startCity);
		City toCity = printCityByName(stopCity);

		if (fromCity == null) {
			fromCity = new City(startCity);

			cityesList.add(fromCity);
		}

		if (fromCity == null) {
			fromCity = new City(startCity);

			cityesList.add(fromCity);
		}

		fromCity.adaugaLegaturaCuCity(fromCity, km);
		toCity.adaugaLegaturaCuCity(toCity, km);

	}

	private City printCityByName(String nameCity) {

		for (City city : cityesList)
			if (city.containName(nameCity)) {
				return city;
			}
		return null;
	}

}
