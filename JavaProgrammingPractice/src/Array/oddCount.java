package Array;

public class oddCount {
    static int arr[]={1,2,3,4,5};
    static int counteven;
    static int countodd;

    public static void main(String[] args) {
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                new oddCount().counteven++;
            }
            else{
                new oddCount().countodd++;
            }
        }
        System.out.println(new oddCount().counteven+""+new oddCount().countodd);
    }
}
