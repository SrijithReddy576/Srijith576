package com.dao.task;

public class FizzBuzzTask {
	void numbers() {
		for (int number = 1; number <= 100; number++) {
			if (number % 3 == 0 && number % 5 == 0) {
				System.out.println("Fizz Buzz");
			} else if (number % 3 == 0) {
				System.out.println("Fizz");
			} else if (number % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(number);
			}
		}

	}

	public static void main(String[] args) {
		FizzBuzzTask fbt = new FizzBuzzTask();
		fbt.numbers();
	}
}
