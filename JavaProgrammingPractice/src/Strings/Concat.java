package Strings;

import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("Enter another String");
        String str1=sc.next();
        System.out.println(str.concat(str1));
        System.out.println((str.concat(str1)).toUpperCase());
        System.out.println(str.indexOf('c'));
        System.out.println(str.replace('c','C'));

    }
}
