import java.util.*;
public class sumOfn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		for(int i=0;i<=n;i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
