package exception2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Home {
	public static void main(String[] args) {
		int num1, num2;
		File fileName = new File("E:\\Java\\Practice\\Exception\\src\\exception2\\File.txt");
		try {
			FileReader fr = new FileReader(fileName);
			System.out.println("Got it");
		}
		catch (FileNotFoundException e) {
			System.out.println("File no found");
		}
		System.out.println("Im out of try-catch block in Java.");
	}

}
