//program to find the relation between the operators
import java.util.Scanner;
public class ex1 {
  public static void main(String[] args) { 
	  //create scanner to obtain input from the command window
	  Scanner input=new Scanner(System.in);
	  int num1;
	  int num2;
	  System.out.println("input first integer:");
	  num1=input.nextInt();//READS FIRST NUMBER FROM USER
	  System.out.println("input second integer:");
	  num2=input.nextInt();//READS SECOND NUMBER FROM USER
	  if(num1==num2){
		  System.out.println("they are equal");
	  }else if(num1>num2){
			  System.out.println("num1 is bigger than number2");
			  }else if(num1<num2){
				  System.out.println("num2 is bigger than num1");
			  }
	

	}

}
