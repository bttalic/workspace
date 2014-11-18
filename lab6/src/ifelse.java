import java.util.Scanner;


public class ifelse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		long broj = in.nextLong();
			
			
		if  (broj/100<1)
			{
			System.out.println("Broj je manji od 100");
			}
		else if (broj/1000<=1)
		{
			System.out.println("Broj je manji od 1000");
			} 
		else {
			System.out.println("Prechera ga!!!");
		}}}
