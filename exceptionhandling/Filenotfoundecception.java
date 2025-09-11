package exceptionhandling;
import java.io.File;
import java.io.FileReader;

public class Filenotfoundecception {

	public static void main(String[] args) {
		try {
			File file=new File("E:/java codes prtc");
			FileReader fr=new FileReader("file");
			fr.close();
			System.out.println("file exist");
		}
		catch(Exception e) {
			System.out.println("file does not exist");
			
		}

	}

}
