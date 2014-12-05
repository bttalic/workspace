package lab03122014;

import java.util.Random;
import java.util.Scanner;

public class Minesweeper {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Unesite Duzinu");
		int duzina = in.nextInt();
		System.out.println("Unesite Sirinu");
		int sirina = in.nextInt();
		
		
		int niz[][] = napraviNiz(duzina, sirina);
		int brojMina = (int) ((duzina * sirina) * 0.30);
		rasporediMine(niz, brojMina);
		ispis(niz);
       	int[][] praznaTabla = new int[duzina][sirina];
		for (int i = 0; i < praznaTabla.length; i++) {
			for (int j = 0; j < praznaTabla.length; j++) {
				praznaTabla[i][j] += -3;
			}
		}

		do {
			try {
				ispis(praznaTabla);
				System.out.println("Unesite Koordinatu X");
				int X = (in.nextInt())-1;
				System.out.println("Unesite Koordinatu y");
				int Y = (in.nextInt())-1;
				praznaTabla[X][Y] = niz[X][Y];
			 	if (niz[X][Y] == -1) {
					System.out.println("Zao mi je izgubili ste");
					System.out.println("");
					ispis(praznaTabla);
					break;
				}

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Zao mi je vrijednosti nisu validne");
			}
		} while (brojMina > 0);

	}

	public static int[][] napraviNiz(int duzina, int sirina) {
		int[][] gotovNiz = new int[duzina][sirina];
		return gotovNiz;
	}

	public static int randomMine(int pocetak, int kraj) {
		int randomJedan = (int) (pocetak + (Math.random()) * (kraj - pocetak));
		return randomJedan;
	}

	public static int[][] rasporediMine(int[][] velicinaTable, int brojMina) {

		while (brojMina > 0) {
			int x = randomMine(0, velicinaTable.length);
			int y = randomMine(0, velicinaTable.length);

			if (velicinaTable[x][y] == 0) {
				velicinaTable[x][y] = -1;
				brojMina = brojMina - 1;
			}

		}

		return velicinaTable;
	}

	public static int[][] povratBrojeva(int[][] tabla)

	{
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[j].length; j++) {
				if (tabla[i][j] == -1) {
					int pocI = i - 1;
					int krajI = pocI + 2;
					int pocJ = i - 1;
					int krajJ = pocI + 2;

					if (pocI < 0) {
						pocI = 0;
					}

					if (pocJ < 0) {
						pocJ = 0;
					}

					if (krajI >= tabla.length) {
						krajI = tabla.length - 1;

					}
					if (krajJ >= tabla.length) {
						krajJ = tabla.length - 1;

					}

					for (int k = pocI - 1; k <= krajI; k++) {
						for (int m = pocJ - 1; m <= krajJ; m++) {
							if (tabla[k][m] != -1) {
								tabla[k][m]++;
							}
						}
					}
				}

			}
		}

		return tabla;
	}

	public static void ispis(int ulazNiz[][]) {
			for (int i = 0; i < ulazNiz.length; i++) {
			System.out.print("|");

			for (int j = 0; j < ulazNiz[i].length; j++) {
				if (ulazNiz[i][j] == -3) {
					System.out.printf("   |");
				} else {
					System.out.printf("%2d |", ulazNiz[i][j]);
				}
			}
			System.out.println();

		}
		System.out.println();
	}

}
