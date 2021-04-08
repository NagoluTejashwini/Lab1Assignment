package lab1.assignment;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		CalculateSum obj = new CalculateSum();
		int sum = obj.calculateSum(n);
		System.out.println("The sum of first "+n+" natural numbers divisible by 3 or 5:"+sum);
	}
	public int calculateSum(int n) {
		int sum =0;
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0|| i % 5 == 0) {
				sum+=i;
			}
		}
		return sum;
	}

}
