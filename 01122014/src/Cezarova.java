import java.util.Scanner;

public class Cezarova {

	public static void main(String[] args) {
		
		String abeceda = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
		String abecedaL=abeceda.toLowerCase();
		String cezarova= "XYZABCDEFGHIJKLMNOPQRSTUVW ";
		
		
		Scanner in = new Scanner (System.in);
		System.out.println("Upisite rijec za sifriranje");
		String recenica= in.nextLine();
		char[] recenica1= recenica.toCharArray();
		String finalni="";
		
	
		for (int i=0 ;i<recenica1.length ;i++){
		int index = abecedaL.indexOf(recenica1[i]);
		finalni+=cezarova.charAt(index);
		}System.out.println(finalni);
			}
			
	}
			
		
