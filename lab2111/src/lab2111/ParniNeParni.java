package lab2111;

import java.util.Scanner;

public class ParniNeParni {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite BROJ!");
		int uneseniBroj = in.nextInt();
		
	int i = 0;
		int j = 0;
		String parni = "";
		String neparni = "";

		for (i = 0; i <= uneseniBroj; i++) {
			if (i % 2 == 0) {
				parni = parni + i + " ";

			}
		}
		System.out.println("Parni su: " +parni);

		for (j = 0; j <= uneseniBroj; j++) {
			if (j % 2 != 0) {
				neparni = neparni + j + " ";
			}
		}
		System.out.println("Neparni su: " +neparni);

	}

}