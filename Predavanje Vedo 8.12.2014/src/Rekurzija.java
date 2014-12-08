
public class Rekurzija {
	
	public static void main(String[] args) {
		int broj = 10;
				prvaRekurzija(broj);
	}

	public static void prvaRekurzija(int broj){
		if (broj==1){
			System.out.println("Broj je : 1" );
		}else{
			System.out.println("broj je : " + broj);
		 prvaRekurzija(broj-1);
		 
		}
	}
}
