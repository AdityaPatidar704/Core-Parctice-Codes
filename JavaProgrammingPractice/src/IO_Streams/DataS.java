package IO_Streams;

import java.io.*;

public class DataS {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos =new DataOutputStream(new FileOutputStream("C:\\JavaProgram\\IOFolder\\file3.txt"));
        dos.writeInt(1000);
        dos.writeChar('c');
        dos.close();
        DataInputStream dis=new DataInputStream(new FileInputStream("C:\\JavaProgram\\IOFolder\\file3.txt"));
        System.out.println("connect");
        System.out.println(dis.readInt()+" "+dis.readChar());
    }
}
