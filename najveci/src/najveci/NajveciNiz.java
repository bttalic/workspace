package najveci;

public class NajveciNiz {

	public static void main(String[] args) {
		int[] arr3 = new int[] { 1, 2, 4 };
		int[] arr = new int[] { 1, 2, 56, 53, 21, };
		System.out.println(getMax(arr3));
	}
	
	
	

	public static int getMax(int[] brojevi) {
		int max = brojevi[0];
		for (int idx = 1; idx < brojevi.length; idx++) {
			int trenutni = brojevi[idx];
			if (trenutni > max) {
				max = trenutni;

			}
		}
		return max;

	}

	public static String nizUString(int[] niz) {
		if (niz.length==0) {
			return"";
		}
		else {
		String strNiz = String.valueOf(niz[0]);
		for (int idx = 1; idx < niz.length; idx++) {
			strNiz = strNiz + niz[idx] + ",";
		}
		return strNiz;
	}}
}
