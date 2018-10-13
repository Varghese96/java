package que;
import java.util.regex.Pattern;

/**
 * Created by expertzlab9 on 20/7/18.
 */
public class RegEx1 {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("[\\D]{1,6}","aaaa"));
        System.out.println(Pattern.matches("[@&%]","@"));
        System.out.println(Pattern.matches("[\\t+&&\\d+]{1,9}","23adshj2er"));
        System.out.println(Pattern.matches("[\\w]+[@][\\w]+[.][c][o][m]","abc@gmail.com"));
        System.out.println(Pattern.matches("[+][9][1][0-9]{10}","+918157019616"));
    //    System.out.println(Pattern.matches("");
    }
}
