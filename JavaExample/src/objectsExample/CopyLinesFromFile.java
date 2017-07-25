package objectsExample;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyLinesFromFile {

	public static void main(String[] args) throws IOException {
		BufferedReader input = null;
		PrintWriter output = null;
		String line;
		int b = 265555;
		
		Path p = Paths.get("./logfile.txt");
		Path pFile = Paths.get("./file.txt");
		//file with only bytes, impossible to write String  
	    try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(p))) {
	      out.write(b);
	    } catch (IOException x) {
	      System.err.println(x);
	    }
	
	    try {
	    	Files.createFile(pFile);
	    	File test = pFile.toFile();
	    	System.out.println("Boolean isFile(): " + test.isFile());
	    } catch (IOException e) {
	    	System.err.format("createFile error: %s%n", e);
	    }
	   
		try {
			input = new BufferedReader(new FileReader("debut.txt"));
			output = new PrintWriter(new FileWriter("end.txt"));
			line = input.readLine();
			
			if (line != null) {
				output.println(line);
			}
		}
		finally {
			if (input != null) {
				input.close();
			}
			if (output != null) {
				output.close();
			}
			
		}

	}

}
