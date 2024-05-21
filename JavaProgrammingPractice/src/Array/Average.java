package Array;

public class Average {
    public static void main(String[] args) {
        int numerator=0;
        int arr[]={10,20,30,40,50};
        for(int i=0;i<arr.length;i++)
        {
            numerator=numerator+arr[i];
        }
        float f=(float)numerator/ (float)arr.length;
        System.out.println("the average is"+f);
    }
}
