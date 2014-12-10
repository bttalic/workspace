import java.util.Scanner;


public class Korisnik {
public static void main(String[] args) {

	User korisnik=new User();
	unos(korisnik);
	
	User korisnik2=new User();
	unos(korisnik2);
	
	if(korisnik.age>korisnik2.age)
	{ print(korisnik);
	
	}
	else{
		print(korisnik2);
	}
	
}
	
public static void unos (User korisnik){
	
	Scanner in= new Scanner (System.in);
	System.out.println("Unesite ime: ");		
	korisnik.firstName=in.next();
	
	System.out.println("Unesite prezime: ");
	korisnik.lastName=in.next();
	
	System.out.println("Unesite godine: ");
    korisnik.age=in.nextInt();
     }

public static void print(User korisnik){
	System.out.println(korisnik.firstName + " " + korisnik.lastName + " " + korisnik.age);
}

}
