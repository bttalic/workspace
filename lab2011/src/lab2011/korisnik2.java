package lab2011;

import java.util.Scanner;

public class korisnik2 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	        int tri=3;
	        int pet=5;
		    int unosJedan=0;
			int counterTri=0;
			int counterPet=0;
			int counter=0;
							System.out.println("Unesite prvi broj");
							unosJedan=in.nextInt();
 			do 
                 {				
					if  (unosJedan % 3 == 0) 
					{ 
						counterTri++ ;
					}
	
	
	             	if (unosJedan % pet ==0)
	        		{
	        		counterPet++;
	             }
	unosJedan--;
	counter++;
	}
	
	while (1<=unosJedan);
	
				System.out.println("Ukupno djeljivih sa tri: " + counterTri );
				System.out.println("Ukupno djeljivih sa tri: " + counterPet );
}  
}

