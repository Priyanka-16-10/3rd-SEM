import java.util.Scanner;
public class rotateArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int k = sc.nextInt();
		int temp[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=arr[i+k];
		}
		System.out.println(arr);
	}

}
8