package lab2011;

public class Piramide {

	public static void piramida1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%-2d", j);
			}
			System.out.println();
		}
	}

	public static void piramida2(int n) {
		for (int index1 = 1; index1 <= n; index1++) {
				System.out.printf("%3s", ".");
			for (int index2 = 1; index2 <= n - index1; index2++) {
			
				for (int index3 = 1; index3 <= index1; index3++) {
					System.out.printf("%3d", index3);
					
					System.out.println();
				}
			}
		}
	}

	/*
	 * 
	 * 
	 * 
	 * Ipisuje piramidu1121231234n
	 */

	public static void main(String[] args) {
		piramida2(6);
	}
}
