/*Write a Java program to find the number of integers within the range of two specified numbers 
and that are divisible by another number*/
import java.util.Scanner;
public class ex6 {
public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b,i,p;
		System.out.println("input a");
		a=input.nextInt();
		System.out.println("input b");
		b=input.nextInt();
		System.out.println("input p");
		p=input.nextInt();
		for(i=++a;i<=b;i++){
			if(i%p==0)
			System.out.println(+i);
		}

	}

}
