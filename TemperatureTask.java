package com.dao.task;

import java.util.Scanner;

public class TemperatureTask {
	static Scanner sc = new Scanner(System.in);

	void temperature() {
		System.out.println("Enter the Temperature in Fahrenheit");
		float fahrenheit = sc.nextFloat();
		float celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature in Celsius is :" + celsius);

	}

	public static void main(String[] args) {
		TemperatureTask tt = new TemperatureTask();
		tt.temperature();

	}

}
