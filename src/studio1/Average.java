package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter integer 1: ");
		int n1 = in.nextInt();
		System.out.print("Enter integer 2: ");
		int n2 = in.nextInt();
		double avg = (double)(n1+n2)/2;
		System.out.println(avg);
	}

}
