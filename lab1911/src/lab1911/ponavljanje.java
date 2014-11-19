package lab1911;

import java.util.Scanner;

public class ponavljanje {
public static void main(String[] args) {
	int i=0;
	Scanner in= new Scanner(System.in);
	System.out.println("Upisite vase ime: ");
			String ime = in.nextLine();
			System.out.println("Koliko ponavljanja ");
			int x = in.nextInt();
			while (i<x)
			{
				System.out.println("Pozdrav kakav si " + ime);
				i++;
			}
}
}


