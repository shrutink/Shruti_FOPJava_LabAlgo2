package com.gl.main;

import java.util.Scanner;

import com.gl.denomiation.Denomiation;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Denomiation denomiation = new Denomiation();
		System.out.println("Enter the size of currency denomiations");
		Scanner scanner = new Scanner(System.in);
		int sizeOfDenomiation = scanner.nextInt();
		System.out.println("Enter the currency denomiations value");
		int[] currency = new int[sizeOfDenomiation];
		for (int i = 0; i < sizeOfDenomiation; i++) {
			currency[i] = scanner.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amountToPay = scanner.nextInt();
		denomiation.bubbleSort(currency);
		denomiation.noOfNotes(currency, amountToPay);
		scanner.close();
	}

}
