import java.util.*;
public class missingNo {
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[] =new int[n];
         for (int i=0;i<n;i++)
            arr[i]=obj.nextInt();
        boolean found =false;
        for (int i=1;;i++)
        {
            found =false;
            for(int j=0;j<n;j++)
            {
              if(arr[j]==i)
              {
               found=true;
               break;
              }
            }
            if(found==false)
            {
                 System.out.println("missing "+ i);
                 break;
            }           
            
        }  
    }
}
