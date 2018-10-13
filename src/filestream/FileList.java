package filestream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by expertzlab9 on 19/7/18.
 */
public class FileList {
    public static void main(String[] args) throws IOException{

        BufferedReader reader=new BufferedReader(new FileReader("second.txt"));

        ArrayList<String> al=new ArrayList<>();
        String line=reader.readLine();
        String a[]=line.split(" ");
        for(String obj:a){
            System.out.println(obj);
            al.add(obj);
        }
//        for(String obj1:a){
//            System.out.println(obj1);
        }


    }

