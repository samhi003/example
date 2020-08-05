//average of the numbers by using scanner
import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("input first integer:");
		num1=input.nextInt();//SCANS FIRST INTEGER
		System.out.println("input second integer:");
		num2=input.nextInt();//SCANS SECOND
		System.out.println("input third integer");
		num3=input.nextInt();//SCANS THIRD INTEGER
		System.out.println("the average of the numbers are:"+(num1+num2+num3)/3);
		}

}
