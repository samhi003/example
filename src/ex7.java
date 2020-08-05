/*Write a Java program to create and display unique three-digit number using 1, 2, 3,4.
Also count how many three-digit numbers are there*/
public class ex7 {
	public static void main(String[] args) {
		int a=1,b=1,c=1,count=0;
		for(a=1;a<=4;a++){
			for(b=2;b<=4;b++){
				for(c=3;c<=4;c++){
					if(a!=b&&b!=c&&c!=a)
					System.out.println((a+""+b+""+c));
					count=count+1;
				}
			}
		}
		System.out.println("total numbers are"+count);		
	}
}
	

		

