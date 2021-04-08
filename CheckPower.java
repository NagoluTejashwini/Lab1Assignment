package lab1.assignment;

import java.util.Scanner;

public class CheckPower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		if(checkNumber(n)) {
			System.out.println(n+" is power of 2");
		}
		else {
			System.out.println(n+" is not power of 2");
		}

	}
	public static boolean checkNumber(int n) {
		if(n == 0)
			return false;
		int s = (int)(Math.ceil((Math.log(n))/(Math.log(2))));
		int s1 = (int)(Math.floor((Math.log(n))/(Math.log(2))));
		return s == s1 ;
	}

}
