package lab1911;

import java.util.Scanner;

public class alggoritam {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite Broj 1");
		int a = in.nextInt();
		System.out.println("Unesite Broj 2");
		int b = in.nextInt();
		System.out.println("Unesite Broj 3");
		int c = in.nextInt();
		if (a < b && b<c ) {
			System.out.println("A je Najmanje");
		} else if (b < a && b<c) {
			System.out.println("b je Najmanje" );
		} else System.out.println( "C je namjanje");
		in.close();
	}

}
