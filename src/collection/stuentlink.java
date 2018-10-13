package collection;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by expertzlab9 on 17/7/18.
 */
public class stuentlink {
    public static void main(String[] args) {

        LinkedHashMap<String,String>obj=new LinkedHashMap<>();

        obj.put("11","amal");
        obj.put("22","bibin");
        System.out.println(obj.containsKey("11"));
        System.out.println(obj.containsValue("amal"));
        for(Map.Entry<String,String> obj1:obj.entrySet()){
            System.out.println(obj1.getValue());
            System.out.println(obj1.getKey());
        }
    }
}
