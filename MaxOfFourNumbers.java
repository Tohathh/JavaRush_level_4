import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/
public class MaxOfFourNumbers {
    public static void main(String[] args) throws Exception {
        int a, b, e, f;
        String c, d, c1, d1;
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader r = new BufferedReader(inputStreamReader);
        c = r.readLine();
        d = r.readLine();
        c1 = r.readLine();
        d1 = r.readLine();
        a = Integer.parseInt(c);
        b = Integer.parseInt(d);
        e = Integer.parseInt(c1);
        f = Integer.parseInt(d1);
        if (a > b && a > e && a > f)
            System.out.println (a);
        if (b > a && b > e && b > f)
            System.out.println (b);
        if (e > a && e > b && e > f)
            System.out.println (e);
        else
            System.out.println (f);
    }
}
