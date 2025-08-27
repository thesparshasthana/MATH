package Digits;

public class Palindrome {
    public static void main(String[] args) {
        int n = 123;
        int rev =0;
        int ori = n;
        while(n>0){
            int rem = n%10;
            rev = rev *10 +rem;
            n=n/10;
        }
        System.out.println(rev);
        if(ori==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
