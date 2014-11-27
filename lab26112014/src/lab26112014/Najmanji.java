package lab26112014;

import TextIO;

		public class Najmanji {
		
			public static int najManji(int totalBrojeva) {
		
						int j = 0;
						int[] niz = new int[totalBrojeva];
				do {
					System.out.println("Unesi broj");
					niz[j] = TextIO.getlnInt();
					j++;
				} while (j < totalBrojeva);
					int i = 0;
					int mali = niz[0];
				for (i = 0; i < niz.length; i++)
					if (mali > niz[i]) {
						mali = niz[i];
					}
						return mali;
			    }
		
		
			public static void main(String[] args) {
		
				System.out.println("Unesi broj");
				int totalBrojeva = TextIO.getlnInt();
				int mali = najManji(totalBrojeva);
				System.out.println(mali);
			}
		}
