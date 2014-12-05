
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class fileWriter {
public static void main(String[] args) {
	FileWriter fw;
	try {
		fw =new FileWriter(new File("test.txt"));
	    fw.append("evo jedan  red");
	    fw.append('\n');
	    fw.append("Drugi \n red");
	    fw.flush();
	    fw.append('\n');
	    fw.append("Treci \n red");
	    	    
	    fw.close();
	    
	} catch (IOException e){
		e.printStackTrace();
	}	
	
	
	
	
	
	}
}
	
