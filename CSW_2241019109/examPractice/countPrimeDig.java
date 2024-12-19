public class countPrimeDig {
    public static void main(String[] args) {
        int a = 98342,count1=0,count2=0;
        int temp = a;
        while(temp>0){
            int rem = temp%10;
            temp/=10;
            int f =0;
            if(rem == 1)
              count2++;
              else{
                for(int i=2;i<=Math.sqrt(rem);i++){
                    if(rem%i == 0){
                        f=1;
                        break;
                    }
                }
                if(f==0){
                    count1++;
                }
                else{
                    count2++;
                }
              }
        }

         System.out.println("Number of prime digits: "+count1);
         System.out.println("Number of composite digits: "+count2);
    }
}
