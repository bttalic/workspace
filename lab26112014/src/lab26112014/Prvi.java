package lab26112014;

import TextIO;

public class Prvi {

			public static int[] unosNiz(int burek) {
				int i = 0;
				int[] niz = new int[burek];
				
				for (i = 0; i < niz.length; i++) {
					System.out.println("Unesi broj");
					niz[i] = TextIO.getlnInt();
				}
				return niz;
	          }
			
			
			public static void print (int[] niz){
				int i = 0;
				for (i = 0; i < niz.length; i++) {
					System.out.print(niz[i] + " ");
				}
			 }
			
			public static int sumaNiza(int[] niz){
				int suma=0;
				for (int i=0;i<niz.length;i++){
		        	suma=suma+niz[i];
		        }
				
				return suma;
				
			}
			
			
	public static void main (String[] args) {
			
			System.out.println("Unesi broj");
			int totalBrojeva=TextIO.getlnInt();
				int[] niz = unosNiz(totalBrojeva);
		        print(niz);
		        int i=0;
		        int suma = 0;
		        suma=sumaNiza(niz);
		        
	System.out.println("\n\nSuma je :" + suma);	
	}

	}


