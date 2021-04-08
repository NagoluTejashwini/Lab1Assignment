package lab1.assignment;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice\n.RED\n.YELLOW\n.GREEN");
		String choice = sc.nextLine();
		switch(choice) {
		case "RED":System.out.println("STOP");
		break;
		case "YELLOW":System.out.println("READY");
		break;
		case "GREEN":System.out.println("GO");
		break;
		default:System.out.println("Enter a proper choice");
		}
	}

}
