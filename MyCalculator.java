package pack;

import java.util.Scanner;

public class MyCalculator 
{
	public static void main(String[] args) 
	{
		char operation;
		
		Scanner scan = new Scanner(System.in);
		
		float v1, v2, result;
		
		do
		{
			System.out.println("My Calculator Application");
			System.out.println("Choose what you want to do:");
			System.out.println("ADD (enter \'+\')");
			System.out.println("SUBTRACT (enter \'-\')");
			System.out.println("MULTIPLY (enter \'*\')");
			System.out.println("DIVIDE (enter \'/\')");
			System.out.println("QUIT (enter \'+\')");
			System.out.println("============================");
			operation = scan.next().charAt(0);
			
			switch(operation)
			{
				case('+'):
					System.out.println("Adding. Now, enter two numbers you want to add:");
					v1 = scan.nextFloat();
					v2 = scan.nextFloat();
					result = v1+v2;
					System.out.println("The result is " + result + "\n\n");
					break;
				case('-'):
					System.out.println("Subtracting. Now, enter a number followed by the number you want to subtract from it:");
					v1 = scan.nextFloat();
					v2 = scan.nextFloat();
					result = v1-v2;
					System.out.println("The result is " + result + "\n\n");
					break;
				case('*'):
					System.out.println("Multiplying. Now, enter two numbers you want to multiply:");
					v1 = scan.nextFloat();
					v2 = scan.nextFloat();
					result = v1*v2;
					System.out.println("The result is " + result + "\n\n");
					break;
				case('/'):
					System.out.println("Dividing. Now, enter a number followed by the number you want to divide it by:");
					v1 = scan.nextFloat();
					v2 = scan.nextFloat();
					result = v1/v2;
					System.out.println("The result is " + result + "\n\n");
					break;
				case('q'):
					System.out.println("Goodbye. :)");
					break;
				default:
					System.out.println("INVALID CHOICE");
					break;
			}
		}
		while(operation != 'q');
	}
}
