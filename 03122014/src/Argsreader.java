
public class Argsreader {
public static void main(String[] args) {

	public static int sumaReda(int[] red) {
		int suma = 0;
		for (int i = 0; i < red.length; i++) {
			suma += red[i];
		}
		return suma;
	}

	public static int sumaKolone(int[][] array, int kolona) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i][kolona];
		}
		return suma;

	}

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Prosjek redova: ");
		for (int i = 0; i < array.length; i++) {
			double suma = (double) sumaReda(array[1]) / array.length;
			System.out.println(suma);
		}
		System.out.println("Prosjek kolona: ");
		for (int i = 0; i < array[0].length; i++) {
			double suma = (double) sumaKolone(array, i) / array.length;
			System.out.println(suma);
		}

	

	   
	}
}
}
