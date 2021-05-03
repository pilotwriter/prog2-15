package aufgabe15;

import java.io.BufferedReader;
import java.io.File; // Import the File class
import java.io.FileReader;
import java.io.IOException; // Import the IOException class to handle errors
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter; // Import the FileWriter class

public class Measurements {
	private List<String> lines;
	public Measurements() {
		// TODO Auto-generated constructor stub
		lines = new ArrayList<String>();
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
		String result = "rec: " + (end1 - start1) + "  nanosecond" + " iter: " + (end2 - start2) + "  nanosecond";
		writeResults(word.length(), (end1 - start1), (end2 - start2)  );
	}
	public void writeFirstLine() {
		try {
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
			System.out.println("Successfully wrote to the file.");
		
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
	}

}
