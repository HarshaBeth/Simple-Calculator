import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double n1;
		double n2;
		String operation;
		String yorn;
		double answer;

		do {
			// Asks for 1st value
			System.out.println("Enter 1st value: ");
			n1 = scan.nextDouble();

			// Asks for second value
			System.out.println("Enter 2nd value: ");
			n2 = scan.nextDouble();

			// Asks for operation
			System.out.println("Enter the operation (+ - * / %): ");
			operation = scan.next();

			// Performs operation and gives result
			switch (operation) {
			case "+":
				answer = n1 + n2;
				System.out.println("The result of " + n1 + " " + operation + " " + n2 + " is " + answer);
				break;
			case "-":
				answer = n1 - n2;
				System.out.println("The result of " + n1 + " " + operation + " " + n2 + " is " + answer);
				break;
			case "*":
				answer = n1 * n2;
				System.out.println("The result of " + n1 + " " + operation + " " + n2 + " is " + answer);
				break;
			case "/":
				answer = n1 / n2;
				System.out.println("The result of " + n1 + " " + operation + " " + n2 + " is " + answer);
				break;
			case "%":
				answer = n1 % n2;
				System.out.println("The result of " + n1 + " " + operation + " " + n2 + " is " + answer);
				break;
			default:
				System.out.println("You entered wrong operation...");
			}
			// Exits program
			System.out.println("Would you like to continue? (y/n) ");
			yorn = scan.next();
		} while (yorn.equals("y"));
		System.out.println("You have exited!");
	
	}

}
