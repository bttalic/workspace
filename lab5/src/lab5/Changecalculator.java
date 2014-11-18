package lab5;

import java.util.Scanner;

public class Changecalculator {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("How many quarters");
	double number = in.nextInt();
	double quarter =(number * 25);
	
	System.out.println("How many dimes");
	double numberJedan = in.nextInt();
	double dime =(numberJedan * 10);
	
	System.out.println("How many nickles");
	double numberDva = in.nextInt();
	double nickle=(numberDva * 5);
	
	System.out.println("How many peenys");
	double numberTri = in.nextInt();
	double penny =(numberTri * 1);
	
	
	System.out.println((quarter+dime+nickle+penny)/100);
}}
