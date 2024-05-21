package loops;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        System.out.println("enter number from where you want the sum");
        Scanner sc=new Scanner(System.in);
        int snum=sc.nextInt();
        System.out.println("Enter the number till u need sum");
        int lnum=sc.nextInt();
        int i=lnum-snum;
        int sum=0;
        while(i>-1)
        {

            sum=sum+snum;
            snum++;
            i--;
        }
        System.out.println("The sum of number you want is");
        System.out.println("==============================");
        System.out.println("============="+sum+"==============");
    }
}
