public class firstDigPlusLastDig {
    public static void main(String[] args) {
        int x = 4567;
        int y = 312;
        while((x/100)>0){
            x = x/10;
        }
        int ans = x*100+(y%100);
        System.out.println(ans);
    }
}
