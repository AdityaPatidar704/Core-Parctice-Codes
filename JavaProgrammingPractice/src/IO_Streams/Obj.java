package IO_Streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Obj {
    public static void main(String[] args) throws IOException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(""));
    }
}
