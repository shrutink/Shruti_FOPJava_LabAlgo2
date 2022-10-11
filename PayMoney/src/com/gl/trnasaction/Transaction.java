package com.gl.trnasaction;

public class Transaction {

	public void isTargetAchieved(int valueOfTargets, int[] transaction, int noOfTargets) {
		// TODO Auto-generated method stub
		int flag = 0, sum = 0;
		for (int i = 0; i < noOfTargets; i++) {
			sum += transaction[i];
			if (sum >= valueOfTargets) {
				System.out.println("Target achieved after " + (i + 1) + " transactions ");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(" Given target is not achieved ");
		}

	}

}
