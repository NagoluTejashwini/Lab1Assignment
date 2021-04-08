package lab1.assignment;

import java.util.Scanner;

public class FindPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number:");
		int start = sc.nextInt();
		System.out.println("Enter the end number:");
		int end = sc.nextInt();
		System.out.println("The prime number between "+start+" and "+end+" :");
		for(int i = start; i <= end;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}

}
