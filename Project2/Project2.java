

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Project2 {

	public static void main(String[] args) {
		try {
			FileInputStream fileByteStream = new FileInputStream("events.txt");
		} catch (FileNotFoundException e) {
			System.out.print("Unable to find ");
		}
		
	}

}
