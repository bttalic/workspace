package lab2011;

import java.util.Scanner;

public class korisnik {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in); 
	int ispis=0;			;
	int broj=0;
	int counter=0;
	int uslov=-1;
do {System.out.println("unesite broj");
	 broj = in.nextInt();
	 if (broj != -1) {
		 ispis +=uslov;
	 }
	 counter++;

	}

while( broj == -1); 
	System.out.printf("P: %.2f\n", ((double)ispis/counter  ));
			

}\
}
