import java.util.Scanner;
public class lgSumContiSubArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the input values");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
        int currSum = arr[0];
        for(int i=0;i<=n-1;i++){
            currSum = Math.max(arr[i],currSum+arr[i]);
            if(currSum>maxSum)
              maxSum = currSum;
        }
        System.out.println(maxSum);
    }
}
