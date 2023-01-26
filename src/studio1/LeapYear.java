package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What year is it?");
		int yr = in.nextInt();
		boolean leapYear;
		leapYear = (yr % 4 == 0) && (yr % 100 != 0) || (yr % 400 == 0);
		System.out.println(leapYear);
	}

}
