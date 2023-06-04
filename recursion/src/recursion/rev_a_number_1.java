package recursion;

public class rev_a_number_1 {
    public static void main(String[] args) {
        System.out.println((rev(123)));
    }
    static int rev(int n){
        if(n==0){
            return n;
        }
        return (n%10)+(n/10);
    }
}
