package com.gradedproject.q2;

	import java.util.Scanner;

	public class powerOfNumber {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int number = sc.nextInt();
			System.out.println("Enter the power: ");
			int power = sc.nextInt();
			System.out.println(number + " power " + power + " is: " + calcPower(number, power));
		}

		static int calcPower(int number, int power) {
			if (power == 0)
				return 1;
			else if (power == 1)
				return number;
			else
				return number * calcPower(number, (power - 1));
		}

	}
