package lab1911;

public class KalkulatorPlocica {
public static void main(String[] args) {
	System.out.println("unesite Sirinu cm keramicke kocke");
	int kockaKeramicka = TextIO.getInt();
	kockaKeramicka=kockaKeramicka*kockaKeramicka;
	System.out.println("Unesite sirinu bazena u metrima");
	int povrsinaBazena = TextIO.getInt();
    povrsinaBazena = povrsinaBazena*povrsinaBazena *1000;
    
    int brojPlocica= povrsinaBazena/kockaKeramicka;
    System.out.println("Broj plocica: " + brojPlocica);
	
}
}
