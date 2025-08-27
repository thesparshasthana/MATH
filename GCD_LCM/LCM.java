package GCD_LCM;

public class LCM {
    public static void main(String[] args) {
        int[]arr = {6,6};
        int n =arr.length;
        int result =arr[0];
        for(int i=1;i<n;i++){
            result=lcm(result,arr[i]);
        }
        System.out.println(result);
    }
    public static int lcm(int a , int b){
        int deno = gcd(a,b);
        int ans = (a*b)/deno;
        return ans;
    }
    public static int gcd(int a , int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
