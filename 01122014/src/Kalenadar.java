public class Kalenadar {
	public static void main(String[] args) {
		System.out.println(ispisiMjesec("mjesec",25, 1, 5));

	}

	public static boolean godinaJePrestupna(int godina) {
		if (godina % 400 == 0) {

			return true;
		}
		if (godina % 100 == 0) {
			return false;
		}
		if (godina % 4 == 0) {
			return true;
		}
		return false;
	}

	public static String ispisiMjesec(String nazivMjeseca ,int brDanaUMjesecu, int prviDanUMjesecu,
			int prviDan, String... dani) {
		if (dani.length != 7) {
			dani = new String[] { "Mon", "Tues", "Wed", "Thu", "Fri", "Sat",
					"Sun" };
		}

		String str = " sasasa";
		int idx = prviDan - 1;
		do {
			str += String.format("%4s", dani[idx]);
			idx++;
			idx %= 7;
		} while (idx != prviDan - 1);

		str += "\n";
		int slobodniHMjesta = (prviDanUMjesecu - prviDan  + 7) % 7;

		for (idx = 0; idx < slobodniHMjesta; idx++) {
			str += String.format("%4s", "" );

		}
		while (idx < brDanaUMjesecu + slobodniHMjesta) {
			str += String.format("%4d", (idx - slobodniHMjesta + 1));
				
			idx++;
			if (idx % 7 == 0) {
				str += "\n";
			}
		}
		return str;
	}
}
