public class PravoDugZadatak {
	// Korekcija TREBA da se uradi na nizu jer trebaju se prosljediti dvije
	// stavke

	public static int[][] unosi() {
		System.out.println("Unesite visinu");
		int visina = TextIO.getInt();
		System.out.println("Unesite duzinu");
		int duzina = TextIO.getInt();

		int[][] matrica = new int[visina][duzina];
		return matrica;

	}

	public static void print(int[][] matrica) {

		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void ispis1DNiza(int[] matrica) {

		for (int i = 0; i < matrica.length; i++) {
			System.out.print(matrica[i] + " ");
		}
		System.out.println();
	}

	public static int[][] postaviVrijednost(int[][] matrica) {
		int koordinata1 = 0, koordinata2 = 0;
		do {
			do {
				System.out.println("Unesite koordinatu 1");
				koordinata1 = TextIO.getInt();

				System.out.println("Unesite koordinatu 2");
				koordinata2 = TextIO.getInt();

				if (((0 > koordinata1) || (koordinata1 > matrica.length))
						|| ((0 > koordinata2) || (koordinata2 > matrica.length))) {
					System.out.println("Koordinate nisu u zadanim parametrima");
				}

			} while (matrica[koordinata1][koordinata2] != 0);

		} while (((0 > koordinata1) || (koordinata1 >= matrica.length))
				|| ((0 > koordinata2) || (koordinata2 >= matrica[koordinata1].length)));

		System.out
				.println("Unesite  novu vrijednost koordinate na toj poziciji");
		matrica[koordinata1][koordinata2] = TextIO.getInt();

		return matrica;
	}

	public static int sumaReda(int[] niz) {
		int rezultat = 0;
		for (int i = 0; i < niz.length; i++) {
			rezultat = rezultat + niz[i];
		}
		return rezultat;

	}

	public static int sumaKolone(int[][] niz) {
		int suma = 0;
		int j = 0;

		for (int i = 0; i < niz[j].length; i++) {
			suma = suma + niz[i][j];
		}

		return suma;
	}

	public static void main(String[] args) {
		int[][] matrica = unosi();
		int sumaKolone = 0;
		print(matrica);
		ispis1DNiza(matrica[0]);
		matrica = postaviVrijednost(matrica);
		print(matrica);
		sumaKolone = sumaKolone(matrica);
		System.out.println("Suma kolone : " + sumaKolone);
		boolean istiRed = sviIstiRed(matrica[0]);
		// sviIstiKolona(matrica[0]);
		// sviIstiDijagonala(matrica);
		// sviIStiKontraDijagonala(matrica[0]);
		if (istiRed = true) {
			System.out.println("Sve je isti red");
		}

		for (int i = 0; i < matrica.length; i++) {
			int suma = sumaReda(matrica[i]);
			System.out.println("Suma reda " + (i + 1) + " je : " + suma);

		}

	}

	// private static boolean sviIstiRed(int[] is) {
	// TODO Auto-generated method stub
	// return false;
	// }

	// private static boolean sviIStiKontraDijagonala(int[] is) {

	// }

	// private static void sviIstiDijagonala(int[][] matrica) {
	// TODO Auto-generated method stub

	// }

	 private static boolean sviIstiKolona(int[][] matrica) {
				int kolona=0;
				for (int i = 1; i < matrica.length; i++) {
					if (matrica[i-1][kolona]!=matrica[i][kolona]) {
						return  false;
					} 
				
				return true;
			}

	 }

	private static boolean sviIstiRed(int[] matrica) {

		int izvorni = matrica[0];
		boolean isti = true;
		for (int i = 1; i < matrica.length; i++) {
			if (izvorni == matrica[i]) {
				isti = true;
			} else {
				isti = false;
				break;
			}
		}
		return isti;
	}
}