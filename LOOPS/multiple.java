package LOOPS;

import java.util.Scanner;
public class multiple
{
    public static void main(String[] args) {
        int n,i,z=6;
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.print(z+"\t");
            z+=6;
        }
    }
}