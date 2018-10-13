package linked;
import  java.util.LinkedList;
import  java.util.TreeSet;
/**
 * Created by expertzlab9 on 12/7/18.
 */
public class sample{

    public static void main(String[] args) {

        TreeSet<String> setex=new TreeSet<>();
        setex.add("anna");
        setex.add("zen");
        setex.add("liyo");
        setex.add("anna");
       // setex.add(null);
        for(String obj:setex){
            System.out.println(obj);
        }
    }
}
