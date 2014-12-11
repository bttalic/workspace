
public class Skloniste {

	
	private Animal[] animals;
	private int brojZivotinja;
	private String imeSklonista;
	
	public Skloniste() {
		animals= new Animal[10];
		brojZivotinja=0;
		String imeSklonista="Nepoznato";
	}
	
	public Skloniste(String imeSklonista) {
		animals= new Animal[10];
		brojZivotinja=0;
		this.imeSklonista=imeSklonista;
	}
	
	
	
	
	public void add(String name, String type, int numLegs){
		animals[brojZivotinja]=new Animal(name, type, numLegs);
		brojZivotinja++;
		if (brojZivotinja==animals.length){
			resizeAnimals();
		}
			}
	
	private void resizeAnimals() {
		int newLength=2*animals.length;
		Animal[] temp =new Animal[newLength];
		
		for (int i=0; i< animals.length; i++){
			temp[i]=animals[i];
			
		}
		animals=temp;
	}

	public String toString(){
	String shelterAsString="";
    shelterAsString+= this.imeSklonista + "\n\n";
	for(int i =0;i<brojZivotinja;i++){
		shelterAsString+=animals[i].toString();
		}
		return shelterAsString;
		
	
	}
	
	
	
	public void add(String name, String type){
		animals[brojZivotinja]=new Animal(name, type);
		brojZivotinja++;
}
}