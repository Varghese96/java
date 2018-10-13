package collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by expertzlab9 on 13/8/18.
 */
 public class MStud {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        String str;
        ArrayList<studentz> li = new ArrayList();
        while((str=br.readLine())!=null){

            String[] x= str.split(",");
            li.add(new studentz(Integer.parseInt(x[0]),x[1],Integer.parseInt(x[2])));

        }

        for(studentz list : li){
            System.out.println("Id:"+list.id+"Name:"+list.name+"Marks:"+list.mark);
        }
    }
}

