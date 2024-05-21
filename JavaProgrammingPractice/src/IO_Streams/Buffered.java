package IO_Streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Buffered {
    public static void main(String[] args) {
        System.out.println("buffered stream starts");
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\JavaProgram\\IOFolder\\file1.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\JavaProgram\\IOFolder\\file2.txt"));
            System.out.println("connection Established");
            int x;
            while((x=br.read())!=-1)
            {
                bw.write(x);
            }
            bw.close();
            br.close();
        }
        catch(Exception e){
                System.out.println("error");
        }
        finally {
            System.out.println("Block Get Executed");
        }
    }
}
