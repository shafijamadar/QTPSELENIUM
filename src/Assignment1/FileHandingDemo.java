package Assignment1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileHandingDemo {

	public static void main(String[] args) throws IOException {
		
		// Creatig file
	File file= new File("\\D:\\shafi\\Filehandling.txt");
	file.createNewFile();

	// Writing file
	FileWriter writer= new FileWriter(file);
	
	BufferedWriter out= new BufferedWriter(writer);
	
	out.write("This is a new file which needs to be added to file");
	out.newLine();
	out.write("This is line 2 to be added");
	out.flush();

	// Reading file
	
	FileReader filereader= new FileReader(file);
	
	BufferedReader br = new BufferedReader(filereader);
	String x="";
	
	System.out.println(br.readLine());
	
	while((x = br.readLine()) != null) {
		System.out.println(x);
	}
	
	}

}
