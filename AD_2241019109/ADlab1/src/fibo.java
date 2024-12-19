import java.util.*;
public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
			System.out.println(0);
		else if(n==2)
			System.out.println(1);
		int a=0;
		int b=1;
		int c=0;
	    for(int i=2;i<n;i++) {
	    	c = a+b;
	    	b = c;
	    	a = b;
	    }
	    System.out.println(c);
	}
}
