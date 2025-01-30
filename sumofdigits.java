

public class sumofdigits {

    static int sumofdigits(int n){
        if(n==0){
            return 0;
        }

        return n%10 + sumofdigits(n/10);
    }
    public static void main(String[] args) {
        System.out.println(sumofdigits(222));
    }
}
