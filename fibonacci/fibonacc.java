package fibonacci;
public class fibonacc {
    public static void main(String[] args) {
        int n =5;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n==1 || n==0){
            return n;
        }
        return fib(n-2)+fib(n-1);
    }
}
