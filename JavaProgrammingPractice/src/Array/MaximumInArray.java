package Array;

import java.util.Scanner;

public class MaximumInArray {
    static void meth1(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("the maximum value in given array is:"+max);
    }
    static int[] meth2(int arr[])
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Minimum Value in array is"+min);
        return new int[5];
    }
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter arrau values");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        meth1(arr);
        meth2(arr);
    }
}
