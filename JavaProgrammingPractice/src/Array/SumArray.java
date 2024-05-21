package Array;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        System.out.println("enter Size of array");
        Scanner sc=new Scanner(System.in);
        int arr[];
        int sum=0;
        arr=new int[sc.nextInt()];
        System.out.println("enter the values");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.print("[");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.print("]");
        System.out.println("The sum of array is"+sum);
    }
}
