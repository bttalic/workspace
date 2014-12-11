
public class Student {

	
	
private String imeIPrezime;
private Datum datumRodjenja;
private Datum datumUpisa;
private double gpa;
private int brIndexa;
private static int brstudenta=0;


public Student(){
	this("John doe", new Datum(), new Datum());
	}
	
	

public Student (String imeIprezime,Datum datumUpisa,Datum datumRodjenja){
	this.imeIPrezime=imeIprezime;
	this.datumRodjenja=datumRodjenja;
	this.datumUpisa=datumUpisa;
	brstudenta++;
	this.brIndexa=brstudenta;
	
}


public Student (Student other){
	
	this.imeIPrezime=other.imeIPrezime;
	this.datumRodjenja=other.datumRodjenja;
	this.datumUpisa=other.datumUpisa;
	this.gpa=other.gpa;
	this.brIndexa=other.brIndexa;
	
}

}
