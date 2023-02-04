package Demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App3 {
	public static void main(String[] args) throws FileNotFoundException {
		try {

			App3.app();
		} catch (Exception e) {
			// System.out.println(e.getMessage());
		}

	}

	public static void app() throws FileNotFoundException {
		File file = new File("text.txt");
		FileReader fr = new FileReader(file);
	}
}
