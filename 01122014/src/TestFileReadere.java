import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFileReadere {

	public static void main(String[] args) {
		Scanner in;
	try{	in = new Scanner(new File("test.txt"));
 while(in.hasNext()){
	 System.out.println(in.nextLine());
 }
 }catch(FileNotFoundException e){
	 e.printStackTrace();
 }
	}
}
