import java.util.Scanner;


public class Animal {
	
private String name;
private String type;
private int numLegs;

public Animal(){
			this.name="Nepoznato";
		    this.type="Nepoznato";
		    this.numLegs=0;
	}


public Animal(String name, String type){
	this.name=name;
    this.type=type;
    this.setNumLegs(5);;
}

public Animal(String newName, String newType, int newNumLeg ){
		if (newName.equals("konj")||newName.equals("pas")||newName.equals("macka")||
				newName.equals("ptica")||newName.equals("riba"))  {
					this.name=newName;}
		else{  throw new IllegalArgumentException("Zao mi je ne prihvatamo tu ziovtinju");
		 }				
			this.type=newType;
			setNumLegs(newNumLeg);
									
			}
			
	



public String toString() {
			String povratString = "";
			povratString = "Name: "+ name + "\nType: " + type + "\nNumber of legs: " + numLegs +"\n"+"\n";
			return povratString;
	}


public void setNumLegs (int numLegs){
	if(this.name.equals("konj") || this.name.equals("pas") || this.name.equals("macka")){
		numLegs= (numLegs>4 || numLegs<0) ?4:numLegs;
	}else if (this.name.equals("ptica")){
		numLegs= (numLegs>2 || numLegs<0) ? 2: numLegs;
	} 
	else if (this.name.equals("ribica")){
		numLegs=0;
	}
	
	this.numLegs=numLegs;
}

public String getName(){
	return this.name;
}

public String getType(){
	return this.type;
}
public int getNumLegs(){
	return this.numLegs;
}

public void setName(String newName){
	this.name=newName;
}
public void setType(String newType){
	this.type=newType;
}

}
