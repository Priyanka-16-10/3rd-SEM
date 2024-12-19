public class frequency {
    public static void main(String[] args) {
        int x = 531155;
        int arr[] = new int[10];
        while (x>0) {
            int dig = x%10;
            arr[dig]++;
            x/=10;
        }
        for(int i=0;i<10;i++){
            if (arr[i] != 0) {
                System.out.println(i+" repeats "+arr[i]+" times");                
            }
        }
    }
}
