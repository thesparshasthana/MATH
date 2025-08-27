package GCD_LCM;

public class GCD_LCM {
    public static void main(String[] args) {
        int[]arr={12,18,24};
        int result = arr[0];
        int n =arr.length;
        for(int i=1;i<n;i++){
            result=gcd(result,arr[i]);
        }
        System.out.println(result);
    }
    public static int gcd(int a ,int b){
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
