import java.util.Scanner;

public class MenuDrivenApp {
	
	public static void main(String[] args) {
		//prompt the user to input something
		
		int decision = 0;
		String userName = "";
		
		Scanner sc = new Scanner(System.in);
		
		//the application exits if the user picks 4
		while (decision != 4) {
			
			
			System.out.println("1) Create a Username");
			System.out.println("2) Pick Yes or No");
			System.out.println("3) Play a number game");
			System.out.println("4) Exit");
			System.out.print("Pick an option: " );
			decision = sc.nextInt();
			
			if (decision >= 6 || decision <= 0) {
				System.out.println("Please FOLLOW THE INSTRUCTIONS!");
			} 
			
			else if (decision == 1) {
				System.out.print("Enter user name: ");
				userName = sc.next();
				if(userName.equals("Will")) {
					System.out.println("Whatcha doin' Will?");
				} else {
				System.out.println("Welcome " + userName + "!");
				}
			} 
			
			else if (decision == 2) {
				System.out.print("Pick yes or no: ");
				String yes = sc.next();
				if (yes.equals("Yes")) {
					System.out.println("Will, Mom says no!");
				
				} else {
					System.out.println("But Yes is my favorite answer!");
				}
				
			} 
			
			else if (decision == 3) {
				int num = 0;
				while (num != 1) {
					//game runs until user picks 0
					System.out.print("Pick a number between 0 and 5: ");
					num = sc.nextInt();
					if (num > -1 && num <= 5) {
						System.out.println("You picked: " + num);
					}
					
					}
				System.out.println("The number game is over!");
			}
				
		}
		
		System.out.println("Goodbye!");
		
	}
}

