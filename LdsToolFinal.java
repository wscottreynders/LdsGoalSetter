package ldstool;
import java.util.Scanner;

/**
*<h2>LDS Goal Setting Tool</h2>
*
*<p> This class is designed to help members of the Church of Jesus Christ of Latter-Day-Saints
* set goals for scripture reading, family history, and temple work. This is accomplished by the user inputting a specific amount 
* of pages to read from the scriptures, or ordinances to complete and then inputting the length of time in which they want to
* accomplish that goal.</p>
*
* <a>href="https://goo.gl/fr8PHb"Click here for more information on JavaDocs</a>
*
* <p>Created: 5/6/2020</p>
* 
* @author Scott Reynders
*/

public class finalTool {
	
	/**
	* This is the main method which contains the information that allows users to loop back and re-enter goals until they
	* are finished with the program.
	* 
	* @param args (String[]; unused)
	* 
	*/

	public static void main(String[] args) {
		int exit = 0;
				while (exit < 1){
				Scanner input = new Scanner(System.in);
				int user = 0;
				user = prompt();
				
					while (user != 1 && user != 2 && user !=3){
						System.out.println("Not a valid input");
						 user = prompt();
					}
					
				calculate(user);
				System.out.print("Enter '1' to exit. Enter '0' to input new data: ");
				exit = input.nextInt();
				}
	}
	
			/**
		 	* This method creates a menu for the user to determine which goal they would like to calculate.
		 	* 
		 	* <pre>Examples:
		 	* {@code 	returnType(1) returns 1
		 	* 	returnType(2) returns 2
		 	* 
		 	* }</pre>
		 	* 
		 	* @return user (int; Which goal setting tool the user will access.)
		 	*/
	
			public static int prompt() {
				Scanner input = new Scanner(System.in);
				int user = 0;
				
				System.out.println("");
				System.out.println("What would you like to calculate?");
				System.out.println("1) Scripture Sutdy");
				System.out.println("2) Temple Work");
				System.out.println("3) Family History");
				System.out.print("> ");
				user = input.nextInt();
				
				return user;	
			}
			
			/**
			 * This method takes the desired options decided upon in the prompt and navigates the user to the desired goal setter.
			 * The user then enters the amounts to be calculated into an array. 
			 * 
			 * @param user (int; takes the number established in the prompt method and then determines which array will be accessed.)
			*/
			
			public static void calculate(int user) {
				Scanner input = new Scanner(System.in);
				double[][] scriptures = new double[6][1];
				double[][] templeWork = new double[9][1];
				double[][] familyHistory = new double[9][1];
				
				if (user == 1) {
					System.out.print("Enter how many days you woud like the task completed in: ");
						scriptures[0][0] = input.nextDouble();
					System.out.print("Enter the first page number of your reading: ");
						scriptures[1][0] = input.nextDouble();
					System.out.print("Enter the last page number of your reading: ");
						scriptures[2][0] = input.nextDouble();
						scriptures[3][0] = calculatePagesPerDay(scriptures[1][0], scriptures[2][0], scriptures[0][0]);
						scriptures[4][0] = calculatePagesPerWeek(scriptures[1][0], scriptures[2][0], scriptures[0][0]);
						scriptures[5][0] = calculateTotalPages(scriptures[1][0], scriptures[2][0]);
						
					System.out.println("------------------------------------------------------------------");
						
					System.out.println("Scritpures");
					System.out.println(" ");
					System.out.println("Total days: " + scriptures[0][0]);
					System.out.println("Total pages: " + scriptures[5][0]);
					System.out.print("Pages per day:");
					System.out.printf("%5.2f\n", scriptures[3][0]);
					System.out.print("Pages per week:");
					System.out.printf("%5.2f\n", scriptures[4][0]);
					
				}
				
				else if (user == 2) {
					System.out.print("Enter how many days you would like the task completed in: ");
						templeWork[0][0] = input.nextDouble();
					System.out.print("Enter the number of baptisms and conformations: ");
						templeWork[1][0] = input.nextDouble();
					System.out.print("Enter the number of Initiatories: ");
						templeWork[2][0] = input.nextDouble();
					System.out.print("Enter the number of Endowments: ");
						templeWork[3][0] = input.nextDouble();
					System.out.print("Enter the number of Sealings: ");
						templeWork[4][0] = input.nextDouble();
						templeWork[5][0] = calculateOrdinancesPerWeek(templeWork[1][0], templeWork[0][0]);
						templeWork[5][0] = calculateOrdinancesPerWeek(templeWork[1][0], templeWork[0][0]);
						templeWork[6][0] = calculateOrdinancesPerWeek(templeWork[2][0], templeWork[0][0]);
						templeWork[7][0] = calculateOrdinancesPerWeek(templeWork[3][0], templeWork[0][0]);
						templeWork[8][0] = calculateOrdinancesPerWeek(templeWork[4][0], templeWork[0][0]);
						
					System.out.println("------------------------------------------------------------------");
					
					System.out.println("Temple Work");
					System.out.println(" ");
					System.out.println("Total days: " + templeWork[0][0]);
					System.out.println("Baptism/Conformations Total: " + templeWork[1][0]);
					System.out.println("Initiatories Total: " + templeWork[2][0]);
					System.out.println("Endowment Total: " + templeWork[3][0]);
					System.out.println("Sealing Total: " + templeWork[4][0]);
					System.out.print("Baptism/Conformations Per Week: ");
					System.out.printf("%5.2f\n", templeWork[5][0]);
					System.out.print("Initiatories Per Week: ");
					System.out.printf("%5.2f\n", templeWork[6][0]);
					System.out.print("Endowments Per Week: ");
					System.out.printf("%5.2f\n", templeWork[7][0]);
					System.out.print("Sealings Per Week: ");
					System.out.printf("%5.2f\n", templeWork[8][0]);	

				}
				
				else if (user == 3) {
					System.out.print("Enter how many days would you like to complete the task in: ");
						familyHistory[0][0] = input.nextDouble();
					System.out.print("Enter the number of baptisms and conformations: ");
						familyHistory[1][0] = input.nextDouble();
					System.out.print("Enter the number of Initiatories: ");
						familyHistory[2][0] = input.nextDouble();
					System.out.print("Enter the number of Endowments: ");
						familyHistory[3][0] = input.nextDouble();
					System.out.print("Enter the number of sealings: ");
						familyHistory[4][0] = input.nextDouble();
						familyHistory[5][0] = calculateOrdinancesPerWeek(familyHistory[1][0], familyHistory[0][0]);
						familyHistory[6][0] = calculateOrdinancesPerWeek(familyHistory[2][0], familyHistory[0][0]);
						familyHistory[7][0] = calculateOrdinancesPerWeek(familyHistory[3][0], familyHistory[0][0]);
						familyHistory[8][0] = calculateOrdinancesPerWeek(familyHistory[4][0], familyHistory[0][0]);
					System.out.println("------------------------------------------------------------------");
						
					System.out.println("Family History");
					System.out.println(" ");
					System.out.println("Total days: " + familyHistory[0][0]);
					System.out.println("Baptisms/Conformations Total: " + familyHistory[1][0]);
					System.out.println("Initiatories Total: " + familyHistory[2][0]);
					System.out.println("Endowments Total: " + familyHistory[3][0]);
					System.out.println("Sealings Total: " + familyHistory[4][0]);
					System.out.print("Baptisms/Conformations per Week: ");
					System.out.printf("%5.2f\n", familyHistory[5][0]);
					System.out.print("Initiatories per Week: ");
					System.out.printf("%5.2f\n", familyHistory[6][0]);
					System.out.print("Endowments per Week: ");
					System.out.printf("%5.2f\n", familyHistory[7][0]);
					System.out.print("Sealings per Week: ");
					System.out.printf("%5.2f\n", familyHistory[8][0]);

				}
				
			}
			
			/**
			 * This method is used to calculate how many pages the user must read daily to meet their goal.
			 * 
			 * <pre>Examples:
			 * {@code 	calculatePagesPerDay(12, 76, 15) returns 4.27
			 * 	calculatePagesPerDay(5, 100, 15) returns 6.33
			 * 
			 * }</pre>
			 * 
			 * @param a (double; first page number to be read.)
			 * @param b (double; last page number to be read.)
			 * @param c (double; number of days the pages will be read in.)
			 * @return pagesPerDay (double; how many pages must b read each day for the user to meet their goal.)
			*/
			
			public static double calculatePagesPerDay(double a, double b, double c) {
				double totalPages = b - a;	
				double pagesPerDay = totalPages / c;
					
				return(pagesPerDay);	
			}
			
			/**
			 * This method is used to calculate how many pages must be read per week to meet the users goal.
			 * 
			 * <pre>Examples:
			 * {@code 	calculatePagesPerWeek(10, 20, 14) returns 5
			 * 	calculatePagesPerWeek(16, 70, 45) returns 8.4
			 * 
			 * }</pre>
			 * 
			 * @param a (double; first page number to be read.)
			 * @param b (double; last page to be read.)
			 * @param c (double; the total number of days)
			 * @return pagesPerWeek (double; the amount of pages read weekly to meet the users goal.)
			*/
			
			public static double calculatePagesPerWeek(double a, double b, double c) {
				double totalPages = b - a;	
				double weeks = c / 7;
				double pagesPerWeek = totalPages / weeks;
					
				return(pagesPerWeek);
			}
			
			/**
			 * This method is used to calculate the total pages that will be read by the user.
			 * 
			 * <pre>Examples:
			 * {@code 	calculateTotalPages(11, 26) returns 15
			 * 	calculateTotalPages(55, 492) returns 437
			 * 
			 * }</pre>
			 * 
			 * @param a (double; first page number to be read.)
			 * @param b (double; last page number to be read.)
			 * @return totalPages (double; total number of pages to be read.)
			*/
			
			public static double calculateTotalPages(double a, double b) {
				double totalPages = b - a;	
						
				return(totalPages);
			}
			
			/**
			 * This method is used to calculate how many ordinances the user must perform weekly to meet their goal.
			 * 
			 * <pre>Examples:
			 * {@code 	calculateOrdinancesPerWeek(5, 7) returns 5
			 * 	calculateOrdinancesPerWeek(6, 14) returns 3
			 * }</pre>
			 * 
			 * @param a (double; the desired number of ordinances to be performed.)
			 * @param b (double; the desired number of days to complete the ordinances in.)
			 * @return ordinancesPerWeek (double; the amount of ordinances to be performed weekly to meet the user goal.)
			*/
			
			public static double calculateOrdinancesPerWeek(double a, double b) {
				double totalOrdinances = a;
				double weeks = b / 7;
				double ordinacecsPerWeek = totalOrdinances / weeks;
				return(ordinacecsPerWeek);
			}

}
