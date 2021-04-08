package lab1.assignment;

import java.util.Scanner;

public class CalculateDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		CalculateDifference obj = new CalculateDifference();
		int res = obj.calculateDifference(n);
		System.out.println("The calculate difference is :"+res);

	}
	public int calculateDifference(int n) {
		int diff=0;
		int sumOfSquares = (n*(n+1)*(2*n+1))/6;
		int sum = n*(n+1)/2;
		int squareOfSum = (int) Math.pow(sum, 2);
		diff = sumOfSquares-squareOfSum;
		return diff;
	}

}
