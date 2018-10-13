import java.io.IOException;

/**
 * Created by expertzlab9 on 9/7/18.
 */
public class sample {
    public static void check() throws IOException{
        throw new IOException();

    }
    public static void callcheck() throws IOException{
        check();
        
    }

    public static void main(String[] args){

        try{
            callcheck();
        }catch(IOException e){
            System.out.println("checked exception");
        }
    }
}
