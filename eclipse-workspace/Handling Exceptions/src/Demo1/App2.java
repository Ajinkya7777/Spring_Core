package Demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App2 {

	public static void main(String[] args) {

		File file = new File("text.txt");
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("file does not exist");
			System.out.println(e);
			System.out.println(e.toString());
			e.printStackTrace();
		}

	}

}
