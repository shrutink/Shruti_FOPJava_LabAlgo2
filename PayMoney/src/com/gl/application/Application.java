package com.gl.application;

import java.util.Scanner;

import com.gl.trnasaction.Transaction;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction trasaction = new Transaction();
		System.out.println("Enter the size of transaction array");
		Scanner scanner = new Scanner(System.in);
		int arrsize = scanner.nextInt();
		int[] transactions = new int[arrsize];
		System.out.println("Enter the values of array");
		for (int i = 0; i < arrsize; i++) {
			transactions[i] = scanner.nextInt();
		}
		System.out.println("Enter the total number of targets that needs to be achieved");
		int noOfTargets = scanner.nextInt();
		System.out.println("Enter the value of target");
		int valueOfTargets = scanner.nextInt();
		trasaction.isTargetAchieved(valueOfTargets, transactions, noOfTargets);
		scanner.close();
	}

}
