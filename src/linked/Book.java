package linked;
import java.util.Iterator;
import java.util.LinkedList;
/**
 * Created by expertzlab9 on 12/7/18.
 */
public class Book {

    String name;
    float price;
    String author;

    public Book(String name, float price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public static void main(String[] args) {

        LinkedList<Book>Link =new LinkedList<>();
        Book b1=new Book("jocks",120,"nakki");
        Book b2=new Book("sins",100,"Golda");
        Book b3=new Book(" stories",200,"fukri");

        Link.add(b1);
        Link.add(b2);
        Link.add(b3);

        //Link.remove(b2);

        Iterator itr=Link.iterator();
        while (itr.hasNext()){

            Book obj=(Book) itr.next();
            System.out.println(obj.name+" "+obj.price+" "+obj.author);

            for(Book obj1:Link){
                if(Link.contains(b1))
                {
                    System.out.println("true");
                    break;
                }else
                {
                    System.out.println("empty");
                    break;
                }
            }

            for(Book obj2:Link)
                if(Link.contains(b2))
                {

                    b2.name="ss";
                    b2.price=200;
                    b2.author="hepzi";

                }
        }

    }
}
