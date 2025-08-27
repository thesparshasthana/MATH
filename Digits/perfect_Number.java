package Digits;

public class perfect_Number {
    public static void main(String[] args) {
        int n = 28;int sum = 0;
        for(int i=1;i<28;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
    }
}
