package lab1911;

public class PadTlo {

	public static void main(String[] args) {
		double vrijemePada;
		double gravitacija=9.81;
		
		
		System.out.println("Visina od tla u metrima");
		double visina= TextIO.getDouble();
        
               
        System.out.println("Koliko ce vremenski padati?");
		double pretpostavka = TextIO.getDouble();
		
		
		vrijemePada= Math.sqrt((2*visina)/gravitacija);
		
		visina=(1*gravitacija*(vrijemePada*vrijemePada))/2;
		System.out.println("Vrijeme pada:" + vrijemePada);
		
		
		if (vrijemePada-pretpostavka==0) { 
			System.out.println("bili ste u pravu");
	} 
		else if (vrijemePada-pretpostavka<0) {
			System.out.println("Pad je brzi od vaseg unosa");
	}
		else { 
			double ostatak= vrijemePada-pretpostavka;
		System.out.println("tijelo ce padati jos: " + ostatak + "sekundi"  );}
	}
	
	
	
	}

