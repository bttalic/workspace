package lab2111;

import java.util.Scanner;

public class Ispisime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cijeli;

		do {
			int i = 0;
			int rezultatNovi = 0;
			System.out.println("Unesite broj od 1-50");
			cijeli = in.nextInt();

			for (i = 0; i < cijeli; i++) {
				rezultatNovi = rezultatNovi + i;
			}
			if (i <= 50) {
				System.out.printf("Suma brojeva izmedju 1-50 je: %d\n",
						rezultatNovi);
			}
		} while (cijeli <= 50);

		System.out
				.println("Zao mi je unjeli ste broj veci od 50 program se zavrsava");
	}
}