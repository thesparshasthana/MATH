package Power_x;

public class pow {
    public static void main(String[] args) {
        int a = 10;
        int x = -2;
        System.out.println(pow(a,x));
    }
    public static double pow(int a , int x){
        if(x==1){
            return a;
        }
        if(x<0){
            return 1.0/pow(a,-x);
        }
        return pow(a,x-1)*a;
    }
}
