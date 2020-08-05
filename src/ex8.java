// Write a Java program to print the odd numbers from 1 to 99. Prints one number per line
public class ex8 {
	public static void main(String[] args) {
		int i,count=0;
        for(i=1;i<=100;i++)	{     
        	if(i%2!=0){
       count=count+1;//count should be placed in the required loop otherwise the result is 100
        	}
			System.out.println("print odd numbers "+i);
        }
		
		System.out.println("no.of odd numbers"+count);
	}

}
