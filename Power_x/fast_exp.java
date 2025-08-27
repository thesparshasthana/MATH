package Power_x;

public class fast_exp {
    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        System.out.println(pow(a,n));
    }
    public static int pow(int a , int n ){
        if(n==1){
            return a;
        }
        int half = pow(a,n/2);
        if(n%2!=0){
            return half*half*a;
        }
        return half*half;

    }
}
