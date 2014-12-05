import java.util.Scanner;


public class Zadatak {
	
	/**Unos niza kojem morate unjeti broj mjesta i unjeti vrijednosti u int formatu
	 * 
	 * @ ulaz u metodu je niz
	 * @return ispisuje se niz sa unesenim podatcima korisnika
	 */
	public static int[] unosNiza (int niz){
		Scanner in= new Scanner(System.in);
		int[] spremanNiz = new int[niz];
	            for(int i = 0; i<spremanNiz.length;i++){
						System.out.println("Unesite varijablu");
						spremanNiz[i]+= in.nextInt();
					}
	            
	           
	    		
	            System.out.println("Proslo");
		//in.close();
	return spremanNiz;}
	
	/** Ispis niza  ispisuje sve vrijednosti unesenog niza
	 * 
	 * @param ulaz je niz popunjenih vrijendosti 
	 */
	public static void ispis (int[] ispisNiz){
		
		for(int i = 0; i<ispisNiz.length;i++){
			if (i == ispisNiz.length -1){
				System.out.print(ispisNiz[i]);
			}else {
				System.out.print(ispisNiz[i] + ", ");
			}
			   
		}
		
	}
	
	
	public static int  trazi (int[] potragaNiz, int broj){
			for(int i = 0; i<potragaNiz.length;i++){
			 if (potragaNiz[i] == broj){
				return i;
				}
		}
					
		
		return -1;
	}
	
public static void main(String[] args) {
	
		Scanner in= new Scanner(System.in);
		System.out.println("Unesite duzinu niza");
		
		int duzinaNiuza=in.nextInt();
		int[] ispisNiz = unosNiza(duzinaNiuza);
		
		ispis(ispisNiz);
		System.out.println();
		System.out.println("Upisite koji broj trazite: ");

		int potraga=in.nextInt();
	    int rezultatTrazenja=trazi(ispisNiz, potraga);
	    System.out.println();
	    System.out.println("rezultat potrage je Index mjesto :  " + rezultatTrazenja);
		in.close();
}
}
