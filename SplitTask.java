package com.dao.task;

import java.util.Scanner;

public class SplitTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Details");
		String empDetails = sc.next();
		String[] sortedDetails = empDetails.split(",", 4);
		System.out.println("FirstName :" + sortedDetails[0].toUpperCase());
		System.out.println("LastName :" + sortedDetails[1].substring(0, 1).toUpperCase()
				+ sortedDetails[1].substring(1).toLowerCase());
		System.out.println("DOB :" + sortedDetails[2]);
		System.out.println("Desgination :" + sortedDetails[3].substring(0, 1).toUpperCase()
				+ sortedDetails[3].substring(1).toLowerCase());

	}

}
