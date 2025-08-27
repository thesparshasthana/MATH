package Prime;

public class Type_2 {
    public static void main(String[]args){
        int n =10;
        boolean flag = false;
        if(n<2){
            System.out.println("Not a prime");
            return;
        }
        else if (n==2){
            System.out.println("It is a Prime");
            return;
        }
        else{
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    flag =true;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("Not a Prime");
        }else{
            System.out.println("It is a prime");
        }
    }
}
