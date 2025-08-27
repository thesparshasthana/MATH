package Prime.Ranges;

public class Type_1 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int n){
        boolean flag =true;
        if(n<2){
            return false;
        }else if(n==2){
            return true;
        }else{
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    flag =false;
                    break;
                }
            }
        }
        return flag;
    }
}
