import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N. Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Lesson10_Task03 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader r = new BufferedReader(inputStreamReader);
        String a, b;
        a = r.readLine();
        b = r.readLine();
        int c;
        c = Integer.parseInt(b);
        int i = 0;
        while (i<c) {
            System.out.println (a);
            i++;
        }
    }
}
