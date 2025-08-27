package Prime.Ranges;
import java.util.*;

public class Type_2 {
    public static void main(String[] args) {
        int n = 50;
        boolean[] p = new boolean[n+1];
        Arrays.fill(p,true);
        p[0]=p[1]=false;
        for(int i=2;i*i<=n;i++){
            if(p[i]==true){
                for(int j=i*i;j<=n;j+=i){
                    p[j]=false;
                }
            }
        }
        for(int i=0;i<=n;i++){
            if(p[i]==true){
                System.out.print(i+" ");
            }
        }

    }
}
