package loops;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number Whose table u want to print");
        int num=sc.nextInt();
        for(int i=1;i<11;i++)
        {
            System.out.println(num+"X"+i+"="+num*i);
        }
        System.out.println("operation Executed Succesfully");
    }
}
