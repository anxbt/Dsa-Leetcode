package recursion;

public class _1_to_N {
    public static void main(String[] args) {
        System.out.println(fun(5));
    }

    static boolean fun(int n) {
        if (n == 0) {
            return false;
        }
        System.out.println(n);
        fun(n - 1);
        return false;
    }
    static void funrev(int n){
        if (n==0){
            return;
        }
        funrev(n-1);
        System.out.println(n);
    }
}
