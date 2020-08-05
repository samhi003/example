//program to display the numbers that are divided by 3 5 and both b/w 1 to100
public class ex3 {
	public static void main(String[] args) {
		int i;
		for(i=1;i<=100;i++){
			if(i%3==0)
				System.out.println("print the numbers divisible by 3 "+i);
		}
		for(i=1;i<100;i++){
			if(i%5==0)
				System.out.println("print the numbers divisible by 5 "+i);
		}
		for(i=1;i<100;i++){
			if(i%15==0)
				System.out.println(" print the numbers divisible by 15 "+i);
				

}
	}
}


