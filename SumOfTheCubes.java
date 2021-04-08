package lab1.assignment;

import java.util.Scanner;

public class SumOfTheCubes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find the sum of the cubes of digit:");
		int n = sc.nextInt();
		SumOfTheCubes obj = new SumOfTheCubes();
		int res = obj.sumOfTheCubes(n);
		System.out.println("The sum of the cubes of the digit of giben number is:"+res);;

	}
	public int sumOfTheCubes(int n) {
		int sum =0;
		while(n>0) {
			sum+=Math.pow(n%10, 3);
			n/=10;
		}
		return sum;
	}

}
