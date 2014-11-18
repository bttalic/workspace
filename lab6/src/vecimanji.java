import java.util.Scanner;


public class vecimanji {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Molim vas unesite broj: ");
		double brojJedan = in.nextDouble();
		System.out.println("Molim vas unesite jos jedan broj: ");
		double brojDva = in.nextDouble(); 	
        double rezultat = brojJedan-brojDva; 
		
	if ( rezultat < 0 ) {
		rezultat= rezultat * (-1);
		}System.out.println(rezultat);
		}
	}

