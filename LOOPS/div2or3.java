package LOOPS;

import java.util.Scanner;
public class div2or3 {
    public static void main(String[] args) {
        int n,i;
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2==0||i%3==0)
            System.out.print(i+"\t");
        }
    }
    
}
