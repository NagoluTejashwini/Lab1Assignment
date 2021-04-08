package lab1.assignment;

import java.util.Scanner;

public class CheckIncreasing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		if(checkIncreasing(n)) {
			System.out.println(n+" is an increasing number");
		}
		else {
			System.out.println(n+" is not an increasing number");
		}
	}
	public static boolean checkIncreasing(int n) {
		int k = n%10;
		n = n/10;
		while(n>0) {
			if(k < n %10) {
				return false;
			}
			k = n %10;
			n = n/10;
		}
		return true;
	}

}
