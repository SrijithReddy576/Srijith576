package com.dao.task;

import java.util.Scanner;

public class GuessNumberTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int guessNumber = 45;
		boolean b = true;
		System.out.println("Enter the number");
		while (b) {

			int Number = sc.nextInt();
			if (guessNumber == Number) {
				System.out.println("Number Matched");
				b = false;
			} else if (guessNumber > Number) {
				System.out.println("Number should be Greater");
			} else if (guessNumber < Number) {
				System.out.println("Number should be Smaller");
			}
		}

	}
}