package najveci;

public class Spil {
	public static void main(String[] args) {
		int[] spil = noviSpil();

		System.out.println("novi spil " + nizUString(spil));
		int brojPromjena = 100;

		for (int i = 0; i < brojPromjena; i++) {
			zamjeniDvijeKarte(spil);

		}
		
		System.out.println("novi spil " + nizUString(spil));
	}

	public static void zamjeni (int[] niz, int idx1,int idx2) {
	int tmp = niz[idx1];
	niz[idx1]= niz[idx2];
	niz[idx2]=tmp;

}
	
public static void print(int[]niz){
	for (int i=0;1<niz.length;i++){
		int tmp=niz[i];
		System.out.println(tmp);
	}
	
}
int[] niz= 
   public static void printb(int[]niz){
	for (int i=niz.length-1;i<=0;i--){
		int tmp=niz[i];
		System.out.println(tmp);
	}
	
}
	


	public static void zamjeniDvijeKarte(int[] spil) {
		int prva = randomKArta();
		int druga = randomKArta();
		zamjeni(spil, prva, druga);

	}

	public static int[] noviSpil() {
		int[] karte = new int[52];
		for (int i = 0; i < karte.length; i++) {
			karte[i] = i + 1;
		}
		return karte;
	}

	public static int randomKArta() {

		return (int) (Math.random() * 52);

	}

	public static String nizUString(int[] niz) {
		if (niz.length == 0) {
			return "";
		} else {
			String strNiz = String.valueOf(niz[0]);
			for (int idx = 1; idx < niz.length; idx++) {
				strNiz = strNiz + "," + niz[idx];
			}
			return strNiz;
		}
	}
}
