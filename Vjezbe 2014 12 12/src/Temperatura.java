public class Temperatura {

	private String celsius;
	private String kelvin;
	private String farenheit;
	private String trenutnaOznaka;
	private double temperatura;
	private double toBeTemperatura;

	public Temperatura(String oznaka, int temperatura) {
		if (oznaka.toLowerCase().toString().equals("c")
				|| oznaka.toLowerCase().toString().equals("k")
				|| oznaka.toLowerCase().toString().equals("f")) {
			this.trenutnaOznaka= oznaka.toLowerCase();
			this.temperatura = temperatura;
			System.out.println("");

		}
	}

	

	public double konverzijaToC(double temp, String pocetna, String krajnja) {
		double celsius = 0;
		

		if (pocetna.equals("k")) {
			celsius = temp - 273.15;
			
		}
		if (pocetna.equals("f")) {
			celsius = (temp-32)/1.8 ;
		}
		else{}
		return celsius;
	}
	
	public double konverzijaToF(double temp, String pocetna) {
		double farenheit = 0;
		

		if (pocetna.equals("k")) {
			farenheit = (temp*1.8) - 459.67;
			
		}
		if (pocetna.equals("c")) {
			farenheit = (temp-32)*1.8 ;
		}
		else{}
		return farenheit;
	}
	
	
	public double konverzijaToK(double temp, String pocetna) {
		double kelvin = 0;
		

		if (pocetna.equals("c")) {
			kelvin = temp + 273.15;
			
		}
		if (pocetna.equals("f")) {
			kelvin = (temp+459.67)*1.8 ;
		}
		else{}
		return kelvin;
	}



	public String getCelsius() {
		return celsius;
	}



	public void setCelsius(String celsius) {
		this.celsius = celsius;
	}



	public String getKelvin() {
		return kelvin;
	}



	public void setKelvin(String kelvin) {
		this.kelvin = kelvin;
	}



	public String getFarenheit() {
		return farenheit;
	}



	public void setFarenheit(String farenheit) {
		this.farenheit = farenheit;
	}
}
