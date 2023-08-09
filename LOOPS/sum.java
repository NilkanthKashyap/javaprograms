package LOOPS;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int i,n,sum=0;
        Scanner scan=new Scanner (System.in);
        n=scan.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%5==0)
            sum+=i;
        }
        System.out.print("The sum of the multiples of 5 from 1 to "+ n +" is :-"+sum);
    }
    
}
