public class conti {
    public static void main(String args[])
    {
        int a[]={-1,1,-3,5,-2,4,2};
        int r[]= new int[a.length];
        int ma=Integer.MIN_VALUE;
        int s=a[0];
        for (int i=0;i<a.length;i++)
        {
           s=Math.max(a[i],s+a[i]);
           if (s>ma)
              ma=s;
        }
        System.out.println(ma);
    }
}
