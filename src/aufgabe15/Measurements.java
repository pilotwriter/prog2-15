package aufgabe15;
import java.io.IOException; // Import the IOException class to handle errors

import java.io.FileWriter; // Import the FileWriter class

public class Measurements {
	public Measurements() {
		// TODO Auto-generated constructor stub
		writeFirstLine();
		
	}

	public void measureTimeOfMethod(String word) {
		Palindrom palRec = new PalindromRekursiv();
		Palindrom palIt = new PalindromIterativ();

		long start1 = System.nanoTime();
		palRec.istPalindrom(word);
		long end1 = System.nanoTime();

		long start2 = System.nanoTime();
		palIt.istPalindrom(word);
		long end2 = System.nanoTime();
		writeResults(word.length(), (end1 - start1), (end2 - start2)  );
		System.out.println("Successfully wrote to the file.");

	}
	public void writeFirstLine() {
		try {
			//forr linux
//			File currDir = new File(".");
//			String path = currDir.getAbsolutePath();
//
//			path = path.substring(0, path.length() - 1);
//			String filePath = path + "results.txt";
//			System.out.println(filePath);
			FileWriter myWriter = new FileWriter("C:\\Users\\cadet\\OneDrive\\Desktop\\htw\\lectures\\prog2\\Java\\aufgabe15\\src\\aufgabe15\\results.txt",false);
			myWriter.write("Length \t recursive time \t  Iterative time \n");
			myWriter.close();
		
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
	}
	
	public void writeResults(int length, long recursive, long iterative) {
		try {
//			File currDir = new File(".");
//			String path = currDir.getAbsolutePath();
//
//			path = path.substring(0, path.length() - 1);
//			String filePath = path + "results.txt";
//			System.out.println(filePath);
			FileWriter myWriter = new FileWriter("C:\\Users\\cadet\\OneDrive\\Desktop\\htw\\lectures\\prog2\\Java\\aufgabe15\\src\\aufgabe15\\results.txt",true);
			myWriter.write(length + "\t\t\t" + recursive + "\t\t\t\t\t" + iterative + "\n");
			myWriter.close();
		
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
	}

}
