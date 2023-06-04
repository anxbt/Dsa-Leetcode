package recursion;

public class digitproduct {
    public static void main(String[] args) {
        System.out.println((product(55)));
    }
    static int product(int n){
        if (n==n){
            return 1;
        }
        return product(n / 10) * (n % 10);
    }
}
