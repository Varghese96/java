package filestream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) throws IOException {

        FileWriter fout=new FileWriter("second.txt");
        fout.write("hello world");
        fout.close();

        FileReader fin=new FileReader("second.txt");
        int ch=0;
        FileWriter fout1=new FileWriter("third.txt");
        while ((ch=fin.read())!=-1)
        {
            fout1.write(ch);

        }
        fout1.close();
        fout.close();
        FileReader fin1=new FileReader("third.txt");
        int c=0;
        while ((c=fin1.read())!=-1)
        {
            System.out.print((char)c);
        }

    }


}
