package Countries;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
	 	

	public class CountriesApp {
	 public static String newCountry;
	 public static String newContinent;
	 			
	 	public static void main(String [] args) {
	 		Scanner scnr = new Scanner(System.in);
	 			
	 		System.out.println("Welcome to the Countries Maintenance Application!(choose 1,2 or 3)\n" 
	 					 + "1 - See the list of countries \n2 - Add a country \n3 - Exit");
	 		System.out.println("Enter a menu number: ");
	 			int userInput = scnr.nextInt();
	 			
	 			if (userInput == 1) {
	 				List<Countries> oldCountries = CountriesFileUtil.readFile();
	 			for (Countries countries : oldCountries) {
	 				System.out.println(countries);
	 				}
	 			}
	 			else if (userInput == 2) {
	 				System.out.println("Please enter a new country: ");
	 				newCountry = scnr.next();
	 				System.out.println("Please enter a new continent: (no spaces)");
	 				newContinent = scnr.next();
	 				
	 				Countries countries = new Countries(newCountry, newContinent);
	 				CountriesFileUtil.appendLine(countries);

	 				System.out.println(newCountry + newContinent);
	 			}
	 			else if (userInput == 3) { 
	 				System.out.println("Goodbye!");
	 			}
	 			
//	 			List<Countries> countries = Arrays.asList(
//					new Countries(newCountry, newContinent)
//					); 
//	 			CountriesFileUtil.writeFile(countries);
	 			
	 			
	 		}

	 		}
