package com.brigelabz;

import java.util.Scanner;

public class HelloWorld {
	public boolean check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("GIVE ME THE YEAR FOR CHECKING ");
		int year = sc.nextInt();
		boolean leap; // = false;
		if (year % 4 == 0) {

			if (year % 100 == 0) {

				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			}

			else
				leap = true;
		}

		else
			leap = false;

		if (leap)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
		System.out.println("GIVE ME THE YEAR FOR CHECKING AGAIN ");
		return check();

	}

	public static void main(String[] args) {

		HelloWorld pr = new HelloWorld();
		System.out.println(pr.check());

	}

}
