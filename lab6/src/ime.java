import java.util.Scanner;


public class ime {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Molim vas unesite vase ime: ");
	String ime = in.next(); 
	String zadnjeSlovo = ime.substring(ime.length()-1);
			System.out.println(zadnjeSlovo);
	if (ime.substring(ime.length()-1).equals("h")) {
		System.out.println("Cestitamo vi ste curica");
		}
	else { System.out.println("Zao mi je vi ste decko");}
in.close();}
}
java java