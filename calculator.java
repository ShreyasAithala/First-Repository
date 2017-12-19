package com.npntraining.practice;

import java.util.Scanner;

public class calculator {

	static float a, b, res;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1: Addition");
		System.out.println("2: Substraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		System.out.println("Enter your choice");
		char result = sc.next().charAt(0);

		switch (result) {

		case '1':
			System.out.println("Enter two numbers");
			a = sc.nextFloat();
			b = sc.nextFloat();
			res = a + b;
			System.out.println("The result is " + res);
			break;

		case '2':
			System.out.println("Enter two numbers");
			a = sc.nextFloat();
			b = sc.nextFloat();
			res = a - b;
			System.out.println("The result is " + res);
			break;

		case '3':
			System.out.println("Enter two numbers");
			a = sc.nextFloat();
			b = sc.nextFloat();
			res = a * b;
			System.out.println("The result is " + res);
			break;

		case '4':
			System.out.println("Enter two numbers");
			a = sc.nextFloat();
			b = sc.nextFloat();
			res = a / b;
			System.out.println("The result is " + res);
			break;

		case '5':
			System.exit(0);
			break;

		default:
			System.out.println("Wrong option");

		}
		sc.close();
	}
}
