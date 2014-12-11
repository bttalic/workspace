public class Datum {

	private int dan;
	private int mjesec;
	private int godina;

	/**
	 * Objekt Datum inicijalizira stavke Dan, Mjesec i godina u tom rasporedu i
	 * stavlja im default vrijednost 1.
	 * 
	 * @param postaviDan
	 * @param postaviMjesec
	 * @param postaviGodinu
	 */

	public Datum() {
		dan = 1;
		mjesec = 1;
		godina = 1;

	}

	/**
	 * Objekt Datum inicijalizira stavke Dan, Mjesec i godina u tom rasporedu.
	 * 
	 * @param postaviDan
	 * @param postaviMjesec
	 * @param postaviGodinu
	 */
	public Datum(int Dan, int Mjesec, int Godina) {
		this.setDan(Dan);
		this.setMjesec(Mjesec);
		this.setGodina(Godina);
	
	}

	/**
	 * Konstruktor pretvara integer u string i priprema ga za ispis
	 * 
	 */
	public String toString() {
		String datumKaoString = "";
		datumKaoString = dan + "." + mjesec + "." + godina;
		return datumKaoString;

	}

	/**
	 * Getter preuzima dan iz Datum klase
	 * 
	 * @return Vraca dan u integer obliku
	 */
	public int getDan() {
		return dan;
	}

	/**
	 * Getter preuzima mjesec iz Datum klase
	 * 
	 * @return Vraca mjesec u integer obliku
	 */
	public int getMjesec() {
		return mjesec;
	}

	/**
	 * Getter preuzima godinu iz Datum klase
	 * 
	 * @return Vraca godinu u integer obliku
	 */
	public int getGodina() {
		return godina;
	}

	/**
	 * Setter mjenja varijablu dan i provjerava da li odgovara uslovima koje smo
	 * pripremili
	 * 
	 * @param dan
	 *            se modifikuje sa varijablom noviMjesec
	 */
	public void setDan(int dan) {
		if (dan < 1 || dan > 32) {
			throw new IllegalArgumentException(
					"Dan nije u validnom intervalu birajte izmedju 1-31");
		} else {
			this.dan = dan;
		}
	}

	/**
	 * Setter mjenja varijablu mjesec i provjerava da li odgovara uslovima koje
	 * smo postavili
	 * 
	 * @param mjesec
	 *            se modifikuje sa varijablom noviMjesec.
	 */
	public void setMjesec(int mjesec) {
		if (mjesec < 1 || mjesec > 12) {
			throw new IllegalArgumentException(
					"Mjesec nije u validnom intervalu birajte izmedju 1-12");
		} else {
			this.mjesec = mjesec;
		}
	}

	/**
	 * Setter mjenja varijablu godina i provjerava da li odgovara uslovima koje
	 * smo postavili
	 * 
	 * @param godina
	 *            se modifikuje sa varijablom novaGodina.
	 */
	public void setGodina(int godina) {
		if (godina < 1900 || godina > 3014) {
			throw new IllegalArgumentException(
					"Godina nije u validnom intervalu 1900-3014");
		} else {
			this.godina = godina;
		}
	}

	public Datum(Datum other) {
		this.dan = other.dan;
		this.mjesec = other.mjesec;
		this.godina = other.godina;
	}

	/**
	 * Funkcija poredi dva datuma i vraca stavke -1 ako je prvi datum manji od
	 * drugog 0 ako su datumi jednaki +1 ako je prvi datum veci od drugog
	 * 
	 * @param datumDrugi
	 * 
	 * @return
	 */
	public int compare(Datum datumDrugi) {
		int rezultat = 0;
		if (this.godina == datumDrugi.godina) {
			if (this.mjesec == datumDrugi.mjesec) {
				if (this.dan == datumDrugi.dan) {
					rezultat = 0;
				} else if (this.dan > datumDrugi.dan) {
					rezultat = +1;
				} else {
					rezultat = -1;
				}

			} else if (this.mjesec > datumDrugi.mjesec) {
				rezultat = 1;
			} else {
				rezultat = -1;
			}
		} else if (this.godina > datumDrugi.godina) {
			rezultat = 1;
		} else {
			rezultat = -1;
		}

		return rezultat;
	}
}
