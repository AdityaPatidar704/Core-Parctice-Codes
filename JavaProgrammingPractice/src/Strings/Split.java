package Strings;

public class Split {
    public static void main(String[] args) {
        String s1="apple,banana,grape";
        String s2[]=s1.split(",",2);
        for(int i=0;i<s2.length;i++){
            System.out.println(s2[i]);
        }
        String s3="  remove W H i T E S P A C E  ";
        System.out.println(s3.replaceAll(" ",""));
    }
}
