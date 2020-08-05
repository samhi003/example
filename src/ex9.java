/*Write a Java program that accepts three integer values and return true if one of them 
is 20 or more and less than the substractions of others.*/
import java.util.Scanner;
public class ex9 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("input n1");
		n1=input.nextInt();
		System.out.println("input n2");
		n2=input.nextInt();
		System.out.println("input n3");
		n3=input.nextInt();
		if((n1==20)||(n2==20)||(n3==20)){
			if(((n1-n2>=20)||(n3-n2>=20)||(n3-n1>=20)||(n1-n3==0)||(n2-n1==0)||(n2-n3==0)))
				System.out.println(" true");
		}else
			System.out.println("false");
			
		
				
		
		
		


	}

}
