import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

    /*
    Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
    */
public class MinimumOfTwoNumbers {

    public static void main(String[] args) throws Exception {
        int a, b;
        String c, d;
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader r = new BufferedReader(inputStreamReader);
        c = r.readLine();
        d = r.readLine();
        a = Integer.parseInt(c);
        b = Integer.parseInt(d);
        if(a < b) {
            System.out.println(a);
        }
        else System.out.println(b);
    }
}
