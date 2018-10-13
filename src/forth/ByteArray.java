package forth;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by expertzlab9 on 30/8/18.
 */
public class ByteArray{

    public static void main(String[] args) throws IOException {
        String c="hello";
        byte[] bytearr=c.getBytes();
        FileOutputStream f1=new FileOutputStream("file1.txt");
        FileOutputStream f2=new FileOutputStream("file2.txt");
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        baos.write(bytearr);
        baos.writeTo(f1);
        baos.writeTo(f2);


    }
    }

