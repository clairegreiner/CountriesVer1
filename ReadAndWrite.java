package Countries;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadAndWrite {   //Whoops! not part of the package!

	public static void main(String[] args) {
		{
			
			Path ourGeographyLesson = Paths.get("\\Users\\Claire\\newWorkspace\\CountriesOfTheWorld\\src\\Countries\\CountriesOfTheWorld.txt");  //CharacterGenerator.java
			
			File aNewGeographyLesson = ourGeographyLesson.toFile();
			// aNewFileObj					ourNewPath.toFile()
			
			//This is an important template
			try (  
				PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewGeographyLesson, true)))){  //rt click Surround with Try/Catch
				out.println("country");	  //and then this file shows up in the path specified
			} catch (IOException e) {
				e.printStackTrace();
			} //output stream
			
			try(BufferedReader in = new BufferedReader(new FileReader(aNewGeographyLesson))) {
				String Countries;
				while ((Countries = in.readLine()) != null) {
					System.out.println(Countries);
				}
				System.out.println(Countries);
			} catch(IOException ex) {
				ex.printStackTrace();
			}

	}

	
	}
}

