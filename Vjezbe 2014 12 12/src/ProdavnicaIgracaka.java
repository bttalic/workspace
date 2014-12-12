
public class ProdavnicaIgracaka {
    private  Igracka[] igrackeNiz;
    private int brojIgracaka;

	

	public ProdavnicaIgracaka() {
		
	 Igracka nizIgracaka[] = new Igracka [10];
	
	  
	}
	
	public void add(String igracka,String tip,double cijena, int godinaProiz, int dobOgranicenje, int kolicine){
		
		this.igrackeNiz[brojIgracaka]= new Igracka (igracka,tip, cijena, godinaProiz, dobOgranicenje, kolicine);
		brojIgracaka++;
			
		if (brojIgracaka==igracka.length()){
			resizeIgracke();
		}
			}
	
	private void resizeIgracke() {
		int newLength=2*igrackeNiz.length;
		Igracka[] temp =new Igracka[newLength];
		
		for (int i=0; i< igrackeNiz.length; i++){
			temp[i]=igrackeNiz[i];
			
		}
		igrackeNiz=temp;
	}
  
	
	public String toString() {
		String povratString = "";
		povratString = "Igracka: " +  "\n"				;
		return povratString;
	}
}
