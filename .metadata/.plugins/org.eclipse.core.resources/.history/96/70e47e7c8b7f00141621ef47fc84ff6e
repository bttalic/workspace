import java.util.Scanner;

public class Posta {
	public static void main(String[] args) {
		Dimensions dimenz=dimenzije();
		float [] dimenzije = dimenzije();
		float rezultat = racunajCijenu(dimenzije);
		
		
		System.out.println("Cijena paketa je: " + rezultat);
	}
	
	public static Dimensions dimenzije (){
		Dimensions dim= new Dimensions();
		
	Scanner in = new Scanner(System.in);
	float [] niz = new float [4];
		
		System.out.println("Unesite visinu paketa");
		dim.height= in.nextFloat();
		
		System.out.println("Unesite duzinu paketa");
	    dim.length = in.nextFloat();
		System.out.println("Unesite sirinu paketa");
		dim.width=in.nextFloat();
		System.out.println("Unesite tezinu paketa");
		dim.weight = in.nextFloat();
		
		return dim;
	}

	public static float volumetrijskaTezina(float[] nizPodataka ) {
		float volumetrijskaTezina = (nizPodataka[0] * nizPodataka[2] * nizPodataka[1]) / 5000;

		return volumetrijskaTezina;
	}

	public static float racunajCijenu(float[] nizPodataka) {
		
         float volumetrijskaTezina=volumetrijskaTezina(nizPodataka);
         float tezinaPaketa=nizPodataka[3];
		if (volumetrijskaTezina > tezinaPaketa) {
			tezinaPaketa = volumetrijskaTezina;

		}
		float rezultat = tezinaPaketa * 3;

		return rezultat;
	}
}
