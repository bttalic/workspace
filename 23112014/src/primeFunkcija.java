import java.util.Scanner;

import lab26112014.TextIO;


public class primeFunkcija {
	
	
	public static int getInput (int num1) {
		int gotnumber = num1;  
		System.out.println("Unjeli ste " +gotnumber);
			return gotnumber;
		
										
	}
	
	public static double getInputD (double mydouble) {
		 double gotdouble = mydouble;
		 System.out.println("Unjeli ste " + gotdouble);
			
			return gotdouble; 
			}
			

	public static String getInputS (String myString) {
		
		return myString;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Unesite neki broj");
		int num1 = getInput(num1);§
		System.out.println("Unesite decimalni broj");
		double myDouble = TextIO.getDouble();
		System.out.println("Unesite String");
		String myString = TextIO.getlnString();
		
		
		
		System.out.println();
		
	}

	    
	    
	    
	    


}
