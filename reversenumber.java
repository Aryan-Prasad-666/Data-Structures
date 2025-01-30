public class reversenumber {
    static void reverse(int n, int ans){
        if(n==0){
            System.out.println(ans);
            return;
        }

        ans = ans*10 + (n%10);
        reverse(n/10, ans);
    }

    public static void main(String[] args) {
        reverse(1234, 0);
    }
}
