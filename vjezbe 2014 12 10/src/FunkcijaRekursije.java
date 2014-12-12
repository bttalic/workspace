public class FunkcijaRekursije {

	public static void main(String[] args) {
		int temp = 0;

	}

	public static void rekursija(int x, int y, int[][] tabla) {

		String makeItX = "8";

		for (int i = x; i < tabla.length; i++) {
			for (int j = y; j < tabla.length; j++) {
				if (tabla[i][j] == 0 && tabla[i][j] != 8) {
					tabla[i][j] = 8;
					rekursija(x + 1, y, tabla);
					rekursija(x - 1, y, tabla);
					rekursija(x, y + 1, tabla);
					rekursija(x, y - 1, tabla);

				}
			}

		}

	}

}
