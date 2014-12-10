
public class StudentTest {


	public static void main(String[] args) {
		Student s1 = new Student();
		s1.ime = "Emina";
		s1.prezime = "Narcis";
		s1.brojStudenata = 1;
		s1.brInedxa = s1.brojStudenata;
		
		
		Student s2 = new Student();
		s2.ime = "Muskulus";
		s2.prezime = "MaximusGleutemus";
		s2.brojStudenata = 1;
		s2.brInedxa = s2.brojStudenata;
		
		
		s1.equals(s2);
		System.out.println(s1);
		
	}
	
	
			
	   
	        	  

public static void print (Student s){


System.out.printf("Ime: %10s \nPrezime: %6s \n"+"Index: %8d \nBrstud: %7d", s.ime,s.prezime,s.brInedxa, s.brojStudenata);
System.out.println();
}
}