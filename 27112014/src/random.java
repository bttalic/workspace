
public class random {

	/**Aplication for entering a predifined number of inputs
	 * 
	 * @param Define number of inputs
	 * @return Returns array of info
	 */
	public static int[] unos(int brojUnosa){
		int i=0;
		int[] niz = new int[brojUnosa];
		for (i=0;i<niz.length;i++){
			System.out.println("Unesite Broj");
			niz[i]=TextIO.getInt();
			
	}
		
		return niz;
		
		
	}
	
	/**
	 * 
	 * @param Searches for random value of aray
	 * @param inputs predifined array and number of inputs
	 * @return returns int Average value
	 */
	public static int prosjek (int[] niz, int brojUnosa){
		int suma=0;
		int i=0;
				for (i=0;i<niz.length;i++){
			suma=suma+niz[i];
		}
				suma=suma/brojUnosa;
			return suma;
		}
	
	
	/**
	 * 
	 * @param Calculator of total of array
	 * @param enters array and calculates 
	 * @return returns an integer value
	 */
	public static int suma (int[] niz){
	int suma=0;
	int i=0;
	
	for (i=0;i<niz.length;i++){
		suma=suma+niz[i];
	}
		return suma;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Molim vas unesite broj brojeva: ");
		int brojUnosa=TextIO.getInt();
		
		int niz[]= unos(brojUnosa);
		int suma= suma(niz);
		int prosjek=prosjek(niz, brojUnosa);
		System.out.println("suma je: " + suma);
		System.out.println("Prosjek Je " + prosjek);

		
	}   
}
