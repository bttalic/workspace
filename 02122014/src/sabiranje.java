
public class sabiranje {
public static void main(String[] args) {

	int vrijednost=0;
	try{
	for (int i=0;i<args.length;i++){
		  vrijednost += Integer.parseInt(args[i]);
	}  }
	catch(NumberFormatException e){ System.out.println("Pogrijesili ste unos");
	}System.out.println(vrijednost);
	}
	
}

