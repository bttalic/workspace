package lab2111;

import java.util.Scanner;

public class ProstiBroj {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);

	System.out.println("Unesite Broj: ");
	int broj=in.nextInt();
	int i=2;
	int pCounter=0;
   
		
	for (i=2;i<broj;i++){
		if (broj%i==0){
		pCounter++;
		}
		
	 }
	if (pCounter==0){
			System.out.println("CEstitamo "+broj+" je prime broj" );}
			if (pCounter!=0){
				System.out.println("Na zalost "+broj+" nije prime broj" );
		}
	
	
}
}