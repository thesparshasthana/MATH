package Digits;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int ori = sc.nextInt();
        int n = ori;
        int digits = 0;

        // Count the number of digits
        while (n != 0) {
            digits++;
            n /= 10;
        }

        n = ori; // Reset n for sum calculation
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += Math.pow(rem, digits);
            n /= 10;
        }

        if (sum == ori) {
            System.out.println(ori + " is an Armstrong number.");
        } else {
            System.out.println(ori + " is not an Armstrong number.");
        }
    }
}
