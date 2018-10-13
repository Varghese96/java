package que;

import java.util.regex.Pattern;

/**
 * Created by expertzlab9 on 19/7/18.
 */
public class RegexExample {
    public static void main(String[] args) {
        boolean b= Pattern.matches("..b","abb");

        System.out.println(Pattern.matches("[abc]","aaa"));
        System.out.println(Pattern.matches("[^abc]","z"));
        System.out.println(Pattern.matches("[a-zA-Z]","A"));
        System.out.println(Pattern.matches("[a-z]","a"));
        System.out.println(Pattern.matches("[a-e[m-p]]","e"));
        System.out.println(b);
    }
}
