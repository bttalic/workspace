package lab2011;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("unesite broj: ");
	int broj = in.nextInt();
	int i=0;
	
	boolean rezultat=true;
	 for (i=2;i<=broj/2; i++){
        	if (broj%i==0) 
        	  {rezultat=false;
        	   }
        	if (broj%i!=0) 
        	  {rezultat=true;
        	  }
        	
        	if (rezultat) { System.out.println("test" + i );}
        	
	
	}
	}
}
