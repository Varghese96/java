package collection;
import java.util.Random;

/**
 * Created by expertzlab9 on 13/8/18.
 */
public class Randomotp {

    static char[] passwordMethod(int len){

        System.out.println("generating password using random selection");
        System.out.println("you new password is:");

        String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small="abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";

        String val=caps+small+num;

        Random r=new Random();
        char[] password=new char[len];

        for(int i=0;i<len;i++){

            password[i]=val.charAt(r.nextInt(val.length()));


        }return password;
    }

    public static void main(String[] args) {
        int length=4;
        System.out.println(passwordMethod(length));
    }
}
