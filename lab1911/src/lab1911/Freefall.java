package lab1911;

import java.util.Scanner;

public class Freefall {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Molim vas unesite duzinu pada u Minutama");
	double vrijemePada= in.nextInt();
	vrijemePada=vrijemePada * 60;
	double visina;
	double gravitacija= 9.81;
	
	visina=(1*gravitacija*(vrijemePada*vrijemePada))/2;
	
	System.out.println("Distanca predjena glasi: " + visina + "metara.");
	
	
}
}
