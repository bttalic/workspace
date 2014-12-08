package test;

import java.util.Scanner;

public class ArrayUtil {

	/** Printa  array duziniom indexa!
	 * 
	 * @param array
	 */
	public static void printArray(int[] array){
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+",");
						
		}System.out.println();
	}
	
	
	/**Funkcija pravi 1D niz,
	 * u njega ulazi inter koji definise velicinu niza
	 * a zatim korisnik popunjava vrijednosti niza
	 * i vraca gotov niz
	 * 
	 * @param size
	 * @return
	 */
	public static int[] getUserArray(int size){
		Scanner in = new Scanner(System.in);
		int[] niz = new int [size];
		for(int i=0;i<niz.length;i++){
			System.out.println("Unesite vrijednost u niz na poziciju : " + i);
			niz[i]=in.nextInt();
		}
		
		return niz;
	}
	
	/**Funkcija pravi 1D niz,
	 * u njega ulazi integer koji definise velicinu niza i vrijednost kojom ce se
	 * popuniti citav niz i zatim vraca gotov niz.
	 * @param size 
	 * @param defaultValue
	 * @return
	 */
	public static int[] getArray(int size, int defaultValue){
		int[] niz = new int [size];
		for(int i=0;i<niz.length;i++){
		niz[i]=defaultValue;
				
		}
		
		return niz;
	}
	/**Kopira se niz1 u niz2
	 * 
	 * 
	 * @param niz1
	 * @param niz2
	 */
	public static void copyArray(int[] niz1, int[] niz2){
		if(niz1.length>niz2.length){
			System.out.println("Zao mi je nizove nije moguce kopirati");
			return;
			}
		for(int i=0;i<niz1.length;i++){
			
			niz2[i]=niz1[i];
			}
			
		}
	
	/**
	 * Funkcija prilagodi drugi niz duzinom i izvrsi kopiranje
	 * iz niza1 u niz2
	 * @param niz1
	 * @param niz2
	 * @return
	 */
	public static int[] copyArrayAddapt(int[] niz1, int[] niz2){
	niz2=new int[niz1.length];
			
	for(int i=0;i<niz1.length;i++){
			
			niz2[i]=niz1[i];
			}
			
		return niz2;
		}
	
	
	/**
	 * Pomice niz jedno mjesnto u lijevo
	 * @param niz1
	 * @return
	 */
	public static int[] pomakniLijevo(int[] niz1){
		
		int [] pomaknut = new int [niz1.length];
		for (int i =0; i<niz1.length-1;i++){
			pomaknut[i]=niz1[i+1];
		}
		
	return pomaknut;
	
	}
	
	public static int[] pomakniDesno(int[] niz1){
		
		int [] pomaknut = new int [niz1.length];
		for (int i =0; i<niz1.length-1;i++){
			pomaknut[i+1]=niz1[i];
		}
		
	return pomaknut;

}
	
}
	
