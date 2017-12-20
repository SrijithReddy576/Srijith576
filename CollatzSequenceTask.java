package com.dao.task;

import java.util.Scanner;

public class CollatzSequenceTask {
	static Scanner sc = new Scanner(System.in);
	//static int Number;
	
public static void collatzSequence() {
	System.out.println("Enter the number");
	 int Number = sc.nextInt();
	System.out.println(Number);
	for(;;)
	if(Number==1){
		//System.out.println(Number);
		break;
	}
	else if(Number%2==0){
		Number = (Number*3)+1;
		System.out.println(Number);
	}
	else if(Number%2!=0){
		Number = Number/2;
		System.out.println(Number);
	}

	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CollatzSequenceTask cst = new CollatzSequenceTask();
cst.collatzSequence();
	}

}
