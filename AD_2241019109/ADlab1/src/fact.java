import java.util.Scanner;
public class fact {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
	    int fac=1;
	    if(n==0){
	        System.out.println("factorial is 1");
	    }
	    else{
             for(int i=1;i<=n;i++){
	         fac*=i; 
	   }
	System.out.println(n+" factorial is "+fac);
	}    
  }
}
