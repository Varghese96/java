package filestream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by expertzlab9 on 18/7/18.
 */
public class FileExBuff {
    public static void main(String[] args) throws IOException{

        System.out.println("input a line");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String line=reader.readLine();

        System.out.println(line);

    }
}
