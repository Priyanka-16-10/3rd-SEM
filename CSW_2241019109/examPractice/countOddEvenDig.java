public class countOddEvenDig {
    public static void main(String[] args) {
        int a = 5437312,count1=0,count2=0;
        int temp = a;
        while(temp>0){
            int rem = temp%10;
            temp/=10;
            if(rem%2 == 0)
               count1++;
           else
              count2++;
        }

         System.out.println("Number of even digits: "+count1);
         System.out.println("Number of odd digits: "+count2);
    }
}
