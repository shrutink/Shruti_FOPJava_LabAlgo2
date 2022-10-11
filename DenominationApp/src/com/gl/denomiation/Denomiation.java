package com.gl.denomiation;

public class Denomiation {

	public void noOfNotes(int[] currency, int amoutToPay) {
		int[] result = new int[currency.length];
		for (int i = 0; i < currency.length; i++) {
			if (currency[i] <= amoutToPay) {
				result[i] = amoutToPay / currency[i];
				amoutToPay = amoutToPay % currency[i];
			}
		}
		if (amoutToPay > 0) {
			System.out.println("Amount cannot be made with Denomiation");
		} else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for (int i = 0; i < result.length; i++) {
				if (result[i] != 0) {
					System.out.println(currency[i] + ":" + result[i]);
				}
			}
		}
	}

	public void bubbleSort(int[] currency) {
		for (int i = 0; i < currency.length - 1; i++) {
			for (int j = 0; j < currency.length - i - 1; j++) {
				if (currency[j] < currency[j + 1]) {
					int temp = currency[j];
					currency[j] = currency[j + 1];
					currency[j + 1] = temp;
				}
			}
		}

	}

}
