package lab2011;

import java.util.Scanner;

public class Ispis {
 public static void main(String[] args) {
	int end = 10;
	int counter = 0;
	int razlika = 1;
	System.out.println("ispis brojeva sa petljom");
	for(counter =0; counter<= end;counter +=1){
	System.out.printf("%d ", counter);
	}
	System.out.println("ispis brojeva");
	counter=0;
	while (counter<=end){
System.out.printf("%d ", ++counter);
}
	System.out.println("\nIspis brojeva sa petljom");
 counter=0;
 do {
	 System.out.printf("%d ", ++counter);
 } while (counter <= end);
 }
 
 
 
 
 
 
 }