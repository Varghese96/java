package first;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by expertzlab9 on 10/7/18.
 */
public class Examplis1 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();
        //   List<String> al1=new Arraylist<>
        al.add("anu");
        al.add("manu");
        al.add("anju");
        al.add(null);
//        for (String obj : al) {
//            System.out.println(obj);
////        }
//
//        ArrayList<Integer> i=new ArrayList();
//        i.add(55);
//        i.add(34);
//        for(Integer obj:i)
//            System.out.println(obj);
//    }
//    Iterator itr=al.iterator();
//    while(itr.hasNext()){
//        System.out.println(itr.next());
//    }
//    for(int i=0;i<a1.size();i++){
//
//        System.out.println(al.get(i));//get used


            ArrayList<String> al1 = new ArrayList<>();
            al1.add("tom");
            al1.add("jerry");
            al1.add("micky");
            al.addAll(2,al1);
            al.remove(3);
            for (String obj:al) {
                System.out.println(obj);
            }
        }
    }


