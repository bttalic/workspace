
public class zadatak9 {

	public static void main(String[] args) {
		String str= "Neka recenica  koju provjerava, ali ovaj zarez da zeza.";
	    int redniBrojRijeciKojuTrazimo=4;
		System.out.println("To je rijec: " + izvadiRijec(str,redniBrojRijeciKojuTrazimo));
		
		
	 }

	private static String izvadiRijec(String recenica, int redniBrojRijeciKojuTrazimo) {
	    String trazenaRijec="";
	    int trenutnaRijec=0;
	    int trenutniIndex=0;
	    while(trenutnaRijec<redniBrojRijeciKojuTrazimo){
	    	if (recenica.charAt(trenutniIndex) != ' ' ) {
	    		if (trenutniIndex==0) {
	    			trenutnaRijec++;
	    			
	    		} else{
	    			 if(recenica.charAt(trenutniIndex-1) == ' ')
        trenutnaRijec++;
	    		}
	    	}
	    	trenutniIndex++;
	    }
	    trenutniIndex--;
	    while (recenica.charAt(trenutniIndex) != ' ' )
			    {trazenaRijec+=recenica.charAt(trenutniIndex);
			    trenutniIndex++;
			    }
	    	
	    return trazenaRijec;
	 }

}
