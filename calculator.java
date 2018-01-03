package LearnPackage;

import java.util.Scanner;

public class calculator {

	static float a, b, res;
	static Scanner sc;
	static char flag;

	public static void addition() {
		System.out.println("Enter two numbers");
		a = sc.nextFloat();
		b = sc.nextFloat();
		res = a + b;
		System.out.println("The result is " + res);
	}

	public static void subtraction() {
		System.out.println("Enter two numbers");
		a = sc.nextFloat();
		b = sc.nextFloat();
		res = a - b;
		System.out.println("The result is " + res);
	}

	public static void multiplication() {
		System.out.println("Enter two numbers");
		a = sc.nextFloat();
		b = sc.nextFloat();
		res = a * b;
		System.out.println("The result is " + res);
	}

	public static void division() {
		System.out.println("Enter two numbers");
		a = sc.nextFloat();
		b = sc.nextFloat();
		res = a / b;
		System.out.println("The result is " + res);
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		do {
			System.out.println("1: Addition");
			System.out.println("2: Subtraction");
			System.out.println("3: Multiplication");
			System.out.println("4: Division");
			System.out.println("Enter your choice");
			char result = sc.next().charAt(0);

			switch (result) {
			case '1':
				addition();
				break;

			case '2':
				subtraction();
				break;

			case '3':
				multiplication();
				break;

			case '4':
				division();
				break;

			case '5':
				System.out.println("Wrong option");
				System.exit(0);
				break;

			default:
				System.out.println("Wrong option");
				System.exit(0);

			}
			System.out.println("Do you want to continue?");
			flag = sc.next().charAt(0);
		} while (flag == 'Y' || flag == 'y');

		System.out.println("Thank you for using calculator");
		sc.close();
	}
}