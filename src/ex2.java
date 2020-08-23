//program to input a number and find the sum of its digits
import java.util.Scanner;

public class ex2 {
	int sum = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input a number num:");
		long num = input.nextLong();
		System.out.println("the sum of the digits is :" + sumdigits(num));

	}

	public static int sumdigits(long n) {
		int sum = 0;
		while (n != 0) {
			sum = (int) (sum + n % 10);
			n = n / 10;
		}
		return sum;
	}

	public void newmethod() {
		sum = 2;
	}

}
