
public class AnimalTest {
public static void main(String[] args) {
	Animal theAnimal = new Animal("pas", "Veliki",7);
	
	
	//Animal theanimal2= new Animal("ptica", "veliki");
	System.out.println(theAnimal.toString());
	Skloniste shelter= new Skloniste();
	shelter.add("pas", "glavonja");
	shelter.add("pas", "glavon2ja");
	shelter.add("konj", "glavonja");
	shelter.add("macka", "glav3onja");
	shelter.add("ptica", "glavonja");
	shelter.add("konj", "glavonja");
	shelter.add("macka", "glav1onja");
	shelter.add("ptica", "glavonja");
	shelter.add("konj", "glavonja");
	
	
	Skloniste ius = new Skloniste("IUS");
	ius.add("pas", "smrdo");
	ius.add("macka", "kastro");
	ius.add("konj", "manson");
	ius.add("macka", "De niro");
	
	Skloniste mahala = new Skloniste("MAHALA");
	mahala.add("konj", "Frizerka");
	mahala.add("ptica", "papak");
	mahala.add("pas", " kloc");
	
	System.out.println(shelter.toString());
	System.out.println("Zivotinje u iusu :) ");
	System.out.println(ius.toString());
	System.out.println("Zivotinje u Mahali :");
	System.out.println(mahala.toString());
	
}
}
