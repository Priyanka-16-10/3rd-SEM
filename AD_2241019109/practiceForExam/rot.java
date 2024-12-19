public class rot
{
   public static void main(String args[])
   {
    int a[]={1,2,3,4,5,6};
    int n=a.length,i,k=2;
    int temp[]=new int[n];
    for(i=n-k;i<n;i++)
       temp[i++]=a[i];
    int x=0;
    for(i=0;x<n;i++)
       a[i]=a[x++];  
    x=0;   
    for(i=n-k;i<n;i++)
       a[i]=temp[x++]; 
    for ( i=0;i<n;i++)
       System.out.print(a[i]+" ");
    
  }
}
