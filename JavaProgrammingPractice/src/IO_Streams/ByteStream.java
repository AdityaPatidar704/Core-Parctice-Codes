package IO_Streams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public void meth1()
    {
        System.out.println("Here starts the IO Streams");
        try {
            FileOutputStream fos = new FileOutputStream("C:\\JavaProgram\\IOFolder\\file1.txt",true);
            System.out.println("file Created");
            char arr[]={'J','A','V','A'};
            String s1=new String(arr);
            s1=s1.concat(" is awesome");
            byte arr1[]=s1.getBytes();
            String s2=", I really love to study";
            byte arr2[]=s2.getBytes();
            fos.write(arr2);
        }
        catch(IOException e)
        {
            System.out.println("no file created");
        }
    }
    public void meth2() throws IOException{
        FileInputStream fis=new FileInputStream("C:\\JavaProgram\\IOFolder\\file1.txt");
        int x=0;
        while((x=fis.read())!=-1){
            System.out.print((char)x);
        }
    }
    public static void main(String[] args) throws IOException {
        ByteStream bs=new ByteStream();
        bs.meth2();
    }
}
