import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {		
		Scanner s = new Scanner (System.in);
		
		int n1, n2, choice;
		
		System.out.println("Insert the first number");
		n1 = s.nextInt();
		
		
		System.out.println("Insert 1 to Sum");
		System.out.println("Insert 2 to Subtract");
		System.out.println("Insert 3 to Multiply");
		System.out.println("Insert 4 to Divide");
		choice = s.nextInt();
		
		System.out.println("Insert the second number");
		n2 = s.nextInt();
		
		switch(choice) {
		
		case 1: 
			System.out.println("The result of this sum is: " + (n1 + n2));
			break; 
			
		case 2: 
			System.out.println("The result of this subtraction is " + (n1 - n2)); 
			break;
			
		case 3: 
			System.out.println("The result of this multiplication is " + (n1 * n2));
			break;
			
		case 4: 
			if (n2 == 0) {
				System.out.println("You cannot divide by 0");
		} else {
			System.out.println("The result of this division is " + (n1 / n2));
			break;
			
		}
			
			}
			
			
			
			
			
			
		}
		
		
			

	}


