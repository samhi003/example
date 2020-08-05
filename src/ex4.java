/*Write a Java program that accepts three integers from the user and 
return true if two or more of them (integers ) have the same rightmost digit. 
The integers are non-negative.*/
import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, num3, n, n1, n2;
		System.out.println("input num1 change");
		num1 = input.nextInt();
		System.out.println("input second integer:");
		num2 = input.nextInt();
		System.out.println("input third integer");
		num3 = input.nextInt();
		n = num1 % 10;
		n1 = num2 % 10;
		n2 = num3 % 10;
		if ((n == n1 && n1 == n2) || (n == n1 || n == n2))
			System.out.println("the program statement is true");
		else
			System.out.println("the program statement is false");
	}

}
