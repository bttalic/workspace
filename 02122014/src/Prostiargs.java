import java.util.Scanner;

public class Prostiargs {

	public static void main(String[] args) {
		 int brojac = 0;
		 int unos = 0;
		 int vrijednost = 0;
		 try {
	     vrijednost = Integer.parseInt(args[0]);
		 System.out.println(vrijednost);
		 } catch(NumberFormatException e){
			 System.out.println(e.getMessage());
		 }
			
		do {
			for (int i = 2; i < vrijednost ; i++) {

				if (vrijednost % i == 0) {
					brojac++;
					if (brojac > 0)
						;
					{
						System.out.println("Vas broj nije prime");
						;
					}
				} else
					System.out.println(" Vas broj je prime");

				Scanner in = new Scanner(System.in);
				System.out.println("Molim vas unesite novi broj");
				vrijednost = in.nextInt();
			}
			// catch(NumberFormatException e);
		} while (vrijednost != 0);

	}}


