package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Input a year and we will tell you if it is a leap year.");
	int n1 = in.nextInt();
	boolean leapYear = true;
	leapYear = (((n1 % 4 == 0) && (n1 % 100 != 0)) || (n1 % 400 == 0));
	System.out.println(leapYear);
	}

}
