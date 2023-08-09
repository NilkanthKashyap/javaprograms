package LOOPS;

import java.util.Scanner;

public class divisiblity {
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner (System.in);
        n=scan.nextInt();
        if(n%5==0 && n!=0)
        System.out.println("The number entered is divisible by 5");
        else
        System.out.print("The number entered is not divisible by 5");
    }
    
}
