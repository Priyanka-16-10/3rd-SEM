import java.util.*;
public class minmax {
    public static void main(String args[])
    {
        int a[]={8,20,7,9,15,10};
        Arrays.sort(a);
        int r[]= new int[a.length];
        int ma=0,mi=a.length-1;
        boolean isMax=false;
        for (int i=0;i<a.length;i++)
        {
           if(isMax)
              r[i]=a[ma++];
           else
              r[i]=a[mi--];
           isMax=!isMax;      
        }
        for(int i=0;i<a.length;i++)
             System.out.print(r[i]+" ");
    }
}
