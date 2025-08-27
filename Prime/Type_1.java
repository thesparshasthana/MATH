package Prime;

public class Type_1 {
    public static void main(String[]args){
        int n =10;
        boolean flag = false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Not a Prime");
        }else{
            System.out.println("It is a prime");
        }
    }
}
