package forth;

/**
 * Created by expertzlab9 on 31/8/18.
 */
public class GenericEx<T> {
    private T t;
    public T get(){ return t;}

    public void set(T t){this.t=t;}

    public static void main(String[] args) {
        GenericEx<String> type=new GenericEx<>();
        type.set("annu");
        String str=type.get();
    }
}
