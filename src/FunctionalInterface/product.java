package FunctionalInterface;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

/**
 * Created by expertzlab9 on 29/8/18.
 */
public class product {
    int pid, price;
    String pname;

    public product(int pid, int price, String pname) {
        this.pid = pid;
        this.price = price;
        this.pname = pname;
    }

    public static void main(String[] args) {


        ArrayList<product> al = new ArrayList<>();
        al.add(new product(200, 12, "soap"));
        al.add(new product(100, 20, "book"));
        al.add(new product(300, 50, "cup"));
//        Stream<product> s = al.stream();
//        s.filter(x-> x.price>20).forEach(m->{
//            System.out.println("price "+m.price+" pid "+m.pid+" pname "+m.pname);
//        });

        List<String> al2=al.stream()
                .filter(p->p.price>20)
                .map(p->p.pname)
                .collect(Collectors.toList());

        System.out.println(al2);
        System.out.println("************");
        al2.stream().forEach(p-> System.out.println(p));
 }
}
