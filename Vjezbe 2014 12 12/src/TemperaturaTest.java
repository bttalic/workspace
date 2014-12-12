import java.io.ObjectInputStream.GetField;
import java.util.Scanner;


public class TemperaturaTest {
 public static void main(String[] args) {
	Scanner in= new Scanner (System.in);
	
	
	
	
	
	System.out.println("Unesite slovo vrijdnosti koju unosite: C za celzijuse, K za kelvine, F za farenheit " );
	String oznakaTemperature=in.nextLine();
	
 	System.out.println("Unesite vrijednost: ");
	int temperatura=in.nextInt();
	
	Temperatura konverter =new Temperatura(oznakaTemperature, temperatura);
   
	System.out.println("ispis : "+  );
	
	
	
}
}
