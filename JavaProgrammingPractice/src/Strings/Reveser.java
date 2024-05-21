package Strings;

import java.util.Scanner;

public class Reveser {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int j=str.length();
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length/2;i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = (char) temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println((char)arr[i]);
        }

    }
}
