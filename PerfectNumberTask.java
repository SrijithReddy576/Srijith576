package com.dao.task;

import java.util.Scanner;

public class PerfectNumberTask {
	static Scanner sc = new Scanner(System.in);
	int sum;

	void perfectNumber()

	{
		System.out.println("Please enter the Number");
		int Number = sc.nextInt();
		for (int i = 1; i < Number; i++) {
			if (Number % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == Number) {
			System.out.println(Number + " is perfect number");

		} else {
			System.out.println(Number + " is not perfect number");
		}
	}

	public static void main(String[] args) {
		PerfectNumberTask pnt = new PerfectNumberTask();
		pnt.perfectNumber();
	}

}
