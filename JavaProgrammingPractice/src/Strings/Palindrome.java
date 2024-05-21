package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        int count=0;
        String str=sc.next();
        char[] arr=str.toCharArray();
        for(int i=0;i< arr.length/2;i++)
        {
            if((char)arr[i]==(char)arr[arr.length-1-i])
            {
                count++;
            }
        }
        if(count++==arr.length/2)
        {
            System.out.println("yes");
            System.out.println(arr);
        }
    }
}
