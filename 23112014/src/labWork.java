import lab26112014.TextIO;


public class labWork {
	
	public static int sum (int num1, int num2){
		int sum = num1 +num2;
		return sum;
		}
	
	public static double sum (double num1, double num2){
		double sum = num1 +num2;
		return sum; 
		}
	
	
	public static int difference (int num1, int num2){
		int dif = num1 -num2;
		return dif;
		}
	
	public static double difference (double num1, double num2){
		double dif = num1 -num2;
		return dif; 
		}
	
	
	public static int product (int num1, int num2){
		int sum = num1 *num2;
		return sum; 
		}
	
	public static double product (double num1, double num2){
		double sum = num1 *num2;
		return sum;
		}
	
	
	/**
	 * 
	 * 
	 * Dijeljenje dva broja
	 * @param niti jedan broj ne smije biti 0
	 * @return kolicnik dva broja
	 */
	public static int division (int num1, int num2){
		int sum = num1/num2;
		return sum;
		}
	
	public static double division (double num1, double num2){
		double sum = num1/num2;
		return sum; 
		}
	
public static void main(String[] args) {
	System.out.println("Unesite prvi broj");
	int num1= TextIO.getInt();
	
	System.out.println("Unesite drugi broj");
	int num2= TextIO.getInt();
	

	
System.out.println("Sum: " + sum(num1, num2));
System.out.println("Difference: " + difference(num1, num2));
System.out.println("Product: " + product(num1, num2));
System.out.println("Divison: "+ division(num1, num2));








}
}