package Digits;

public class strong_no {
    public static void main(String[] args) {
        int n = 145 ;
        int ori = n;
        int ans =0;
        while(n!=0){
            int rem = n%10;
            ans+= fact(rem);
            n/=10;
        }
        System.out.println(ans);
        if(ori==ans){
            System.out.println("strong number");
        }else{
            System.out.println("Not a strong number");
        }
    }
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
