import java.util.Scanner;
public class maxMin {

	public static void main(String[] args) {
		
		int arr[] = {10,12,14,17,11};
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max = arr[i];
			else if(min>arr[i])
				min = arr[i];
		}
		System.out.println(max);
		System.out.println(min);
	}

}
