package lab2011;

import java.util.Scanner;

public class korisnik3 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Unesite BRoj : ");
	int broj = in.nextInt();
	int count3 = 0;
	int coun5 = 0;
	
	for (int i=0;i<=broj; i++){
	if (i%3==0) 
	{
		count3++;	
	}
	if (i%5==0) 
	{
		coun5++;	
	}
	
	}
	System.out.println("Brojeva djeljivih sa 3:" + count3);
	System.out.println("Brojeva djeljivih sa 5:" + coun5);
	
}
}
