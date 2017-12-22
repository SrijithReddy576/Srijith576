package com.dao.task;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberTask {

	public static void main(String[] args) {
		int min = 1;
		int max = 100;
		boolean number = true;
		Random rnum = new Random();
		int randomNumber = min + rnum.nextInt(max);
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number");
		while (number) {
			int guessNumber = sc.nextInt();
			if (guessNumber == randomNumber) {
				System.out.println("Number Matched");
				number = false;
			} else if (guessNumber < randomNumber) {
				System.out.println("Number should be Greater");
			} else if (guessNumber > randomNumber) {
				System.out.println("Number should be Smaller");
			}
		}
		sc.close();
	}

}
