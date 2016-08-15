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
import java.util.ArrayList;

public class Validator {

	public static String countries;
	public Validator(String countries) {
		super();
		this.countries = countries;
	}

	

	public String getCountries() {
		return countries;
	}

	public void setCountries(String countries) {
		this.countries = countries;
	}

	public static void main(String[] args) {

		{
			Path ourGeographyLesson = Paths
					.get("\\Users\\Claire\\newWorkspace\\CountriesOfTheWorld\\src\\Countries\\CountriesOfTheWorld.txt"); 

			File aNewGeographyLesson = ourGeographyLesson.toFile();
			// aNewFileObj         ourNewPath.toFile()

			// This is an important template
			try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewGeographyLesson, true)))) { // rt
																														// click
																														// Surround
																														// with
																														// Try/Catch
				out.println(countries); // and then this file shows up in the
										// path specified
			} catch (IOException e) {
				e.printStackTrace();
			} // output stream

			try (BufferedReader in = new BufferedReader(new FileReader(aNewGeographyLesson))) {
				
				while ((countries = in.readLine()) != null) {
					System.out.println(countries);
				}
				System.out.println(countries);
			} catch (IOException ex) {
				ex.printStackTrace();
			}

			ArrayList<String> countriesEntered = new ArrayList<>();

			Path ourNewPath = Paths
					.get("\\Users\\Claire\\newWorkspace\\CountriesOfTheWorld\\src\\Countries\\CountriesOfTheWorld.txt");
			File aNewGeographyLesson = ourGeographyLesson.toFile();
			// the contents						the path
			/*
			 * try (BufferedReader in = new BufferedReader(new
			 * FileReader(aNewFile))) {
			 * 
			 * String aBook; while((aBook = in.readLine()) != null) {
			 * erinsFavBooks.add(aBook); }
			 * 
			 * } catch (IOException e) { e.printStackTrace(); }
			 * 
			 * for (int i = 0; i < erinsFavBooks.size(); i++) {
			 * System.out.println(erinsFavBooks.get(i)); }
			 * 
			 * }
			 */
		}
		
	}
}
