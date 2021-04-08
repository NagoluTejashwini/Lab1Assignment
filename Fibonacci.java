package lab1.assignment;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find fibonacci:");
		int n = sc.nextInt();
		Fibonacci obj = new Fibonacci();
		int res = obj.fibonacciWithoutRecursion(n);
		int res1 = obj.fibonacciUsingRecursion(n-1);
		System.out.println("Fibonacci without using recursion:"+res);
		System.out.println("Fibonacci using recursion:"+res1);
		
	}
	public int fibonacciWithoutRecursion(int n) {
		int a = 0,b=1,c=0;
		if(n <= 1) 
			return n;
		for(int i = 2; i < n; i++) {
			c= a+b;
			a= b;
			b = c;
		}
		return c;
	}
	public int fibonacciUsingRecursion(int n) {
		if(n<=1)
			return n;
		return fibonacciUsingRecursion(n-1)+fibonacciUsingRecursion(n-2);
		
	}

}
