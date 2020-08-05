//Write a Java program to accepts an integer and count the factors of the number.
import java.util.Scanner;
     public class ex5 {
    	 public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int num,i,count=0;
	System.out.println("input integer");
	num=input.nextInt();
	for(i=1;i<=num;i++){
		if(num%i==0){
			count=count+1;
			System.out.println("factors of the input numbers are"+i);
			
		
	}
	}System.out.println("number of factors are:"+count);
    	 }
}
