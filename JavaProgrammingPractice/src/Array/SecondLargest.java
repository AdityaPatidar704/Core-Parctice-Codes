package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int l1=Integer.MIN_VALUE;
        int l2=Integer.MIN_VALUE;
        int arr[]=new int[]{10,5,20,35,25};
        for(int num:arr)
        {
            if(num>l1)
            {
                l2=l1;
                l1=num;
            }
            else if(num>l2&&num!=l1)
            {
                l2=num;
            }
        }
        System.out.println(l2);
    }
}
