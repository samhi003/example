//fibonacii series 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...
public class ex10 {
	public static void main(String[] args) {
	int n1=0,n2=1,n3,sum=0,i;
	System.out.println(n1+"\n"+n2);
	for(i=0;i<=10;i++){
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(n3);
	}
	}

}