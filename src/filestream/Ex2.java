package filestream;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by expertzlab9 on 18/7/18.
 */
public class Ex2 {
    public static void main(String[] args) throws IOException{
        FileWriter fout=new FileWriter("second.txt");
        fout.write("hello world");
        fout.close();

        FileReader fin=new FileReader("second.txt");
        int ch=0;
        while((ch=fin.read())!=-1){
            System.out.println((char)ch);
        }



    }
}
