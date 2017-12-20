package com.dao.conversion;

import java.util.Scanner;

class LengthConversions implements LengthConversionInterface {
	static Scanner sc = new Scanner(System.in);
	static Double meters, centimeter, inches, feet;

	public void centimeterConversion() {
		centimeter = meters * 100;
		System.out.println(centimeter + "cm");

	}

	public void inchesConversion() {
		inches = meters * 39.370;
		System.out.println(inches + "inches");

	}

	public void feetConversion() {

		feet = meters * 3.2808;
		System.out.println(feet + "feet");
	}

	public static void main(String[] args) {
		LengthConversions lc = new LengthConversions();
		System.out.println("Enter the value in meters");
		meters = sc.nextDouble();
		System.out.println("Choose the measurement to convert");
		System.out.println("1.Centimeter");
		System.out.println("2.Inches");
		System.out.println("3.Feet");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			lc.centimeterConversion();
			break;
		case 2:
			lc.inchesConversion();
			break;
		case 3:
			lc.feetConversion();
			break;
		default:
			System.out.println("Choose the above options");
		}
	}

}
