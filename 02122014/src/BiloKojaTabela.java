
public class BiloKojaTabela {

	public static void main(String[] args) {
		int brojRedova=3;
		int brojKolona=3;
		char[][] igra = novaIgra(brojRedova, brojKolona);
		
		
		char znak='X';
		String pozicija="A0";
		ispisiStanjeIgre(igra);
		odigrajPotez(igra, znak, pozicija)
		
	}

	private static char[][] novaIgra(int brojRedova, int brojKolona) {
		return new char[brojRedova][brojKolona];
	}

}
