# LdsTool

## Synopsis
The goal of this project was first nd for most to practice skills for my coding class. The second function of this project was to create
a tool that could be used to set achievable goals for members of the Church of Jesus Christ of Latter-day Saints.

## Motivation
Why did you build this code?
my desire to build this code came from my own desire to set and achieve realistic goals. this is something that I have learned as a 
member of the LDS faith. After some brief searching, I found LDS apps that helped members to set goals, but not to show what efforts
wold be needed on a daily and weekly basis to achieve that goal. So, I decided to make the beginnings of a simple tool that would allow 
members to set goals for scripture reading, family history, and temple work. The code has users input the quantity and the time and then
relates what amount of each goal must be achieved on a daily and weekly basis.

## How to Run
Explain what files are needed to run and which file to run. It is also helpful to include a screenshot of the program running. Make sure image is in your repository.
[Image Caption](image.png)

## Code Example
This code snippet sows how the user can enter input for one tool and then exit to the menu to select an additional tool.
```
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
```

## Tests
I used JUnit4 to test the value returning methods in the program.
```
@Test
	public void testcalculatepagesperday() {
		assertEquals(finalTool.calculatePagesPerDay(10, 20, 2), 5, .0001);
		assertEquals(finalTool.calculatePagesPerDay(10, 50, 5), 8, .0001);
		assertEquals(finalTool.calculatePagesPerDay(15, 100, 8), 10.625, .0001);
```

## Contributors
This prokect was completely created by me.
