package sfera;

public class Sfera {

	public static void main(String[] args) {
		
		double randomBroj = (0+(Math.random())*(50-0+1));
		double volumen = (( 4 * Math.PI * ( randomBroj * randomBroj * randomBroj)) /3) ;
		double povrsina = ( 4 * Math.PI *( randomBroj * randomBroj )) ;
		
		
		
		System.out.println("Random odnosno nasumicni broj glasi: " + randomBroj);
		System.out.print("Volumen Sfere je: ");
		System.out.println(volumen);
		
		System.out.println("Povrsina sfere je: " + povrsina);
		
	}
}
