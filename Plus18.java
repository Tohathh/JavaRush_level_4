import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
Ввести с клавиатуры имя и возраст. Если возраст меньше 18, вывести надпись «Подрасти еще».
*/
/*
Ввести с клавиатуры имя и возраст. Если возраст больше 20, вывести надпись «И 18-ти достаточно».
*/

public class Plus18 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader r = new BufferedReader(inputStreamReader);
        String a,b;
        a = r.readLine();
        b = r.readLine();
        int c;
        c = Integer.parseInt(b);
        if (c < 18)
            System.out.println ("Подрасти еще");
        else
            System.out.println ("И 18-ти достаточно");
    }
}
