import java.util.Scanner;
public class conntiguousSubarraySum 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
         for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
          int maxsum=Integer.MIN_VALUE;
        for (int i=0;i<n ;i++)
        {
            int cursum=0;
            for(int j=i;j<n;j++)
            {
                cursum+=arr[j];
                if(maxsum<cursum)    
                 maxsum=cursum;
           
            }
        }
            System.out.println(maxsum);
    }
            
}


