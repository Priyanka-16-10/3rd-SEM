import java.util.Scanner;
// public class fibonacci{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number till you want to find the fibonacci series");
//         int n = sc.nextInt();
//         int f = 0, s = 1;
//         System.out.println("The fibonacci series is:");
//         int i =1;
//         while(i<=n){
//             System.out.println(f+" ");
//             int next = f+s;
//             f = s;
//             s = next;
//             i++;
//         }
//     }
// }
class fibonacci {
    static int fib(int n)
    {
        if (n==0)
            return 0;
      else if(n==1 || n==2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String args[])
    {
        int n = 15;
        System.out.println("The "+n+"th fibonacci number is "+fib(n));
    }
}