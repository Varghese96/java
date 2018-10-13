package collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by expertzlab9 on 17/7/18.
 */
public class studenttree {

    public static void main(String[] args) {

        TreeMap<Integer,String> m=new TreeMap<>();
        m.put(20,"zen");
        m.put(3,"alan");
        m.put(1,"ancy");
      //  m.put(null,"aff");    //camt add null value and treemap gives ascenting ordred
        for(Map.Entry<Integer,String> obj:m.entrySet()){

            System.out.println(obj.getKey());
            System.out.println(obj.getValue());
        }
    }
}
