package najveci;

public class SAbiranje {
public static void main(String[] args) {
	
	int a=10;
	int b=20;
	
	int rez = zbir(a,b);
	System.out.println(rez);
	System.out.println(zbir(21,23));
}

public static int zbirBrojevaUNizu(int[] brojevi) {
	int suma =0;
	for (int i=0; i<brojevi.length;i++){
		int broj= brojevi[i];
		suma+=broj;
		
	}
	return suma;
	
}

public static int zbir(int i1, int i2){
	return i1+i2;
}
}
