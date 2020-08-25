package fileDic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileExist {

	public static boolean doesFileExist(String path) throws FileNotFoundException {
		boolean val = false;

		File f = new File(path);

		if (f.exists()) {
			System.out.println("file existe!");
		}

		else {
			throw new FileNotFoundException("file not found");
		}

		return val;
	}

	public static void readFile(String path) throws FileNotFoundException {


		File myObj = new File(path);
		Scanner readMyFile = new Scanner(myObj);

		
		while (readMyFile.hasNextLine()) {
			String data = readMyFile.nextLine();
			System.out.println(data);
		}

	}

	public static void main(String args[]) throws FileNotFoundException {

		String path = ".\\src\\fileDic\\file.txt";

		doesFileExist(path);

		System.out.println("===========================================================");
		System.out.println("===============  read the file ============================ ");
		System.out.println("===========================================================");


			readFile(path);

	
		

	
	}
}
