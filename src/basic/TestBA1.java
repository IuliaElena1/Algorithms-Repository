package basic;

public class TestBA1 {
/*
	Scrieti intr-o clasa numita TestBA1 o metoda care primeste ca parametru un sir de int si returneaza media aritmetica a tuturor elementelor 
	din sir. Atentie, elementele din sir sunt intregi, dar rezultatul trebuie sa fie de tip double.

	Semnatura metodei este:*/

	public static void main(String[] args) {
		int[] sir = {2,4,5,7,8};
		System.out.println("Media din sir este" + avg(sir));
	}
	
	 public static double avg(int[] sir) {
		 
		 int sum=0;
		 for(int element : sir) {
			 sum += element;
			 
		 }
		 
		return (double)sum/sir.length;
	
}
}