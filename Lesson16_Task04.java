import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Lesson16_Task04 {
    public static void main(String[] args)   throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String name = r.readLine();
        String y = r.readLine();
        String m = r.readLine();
        String d = r.readLine();
        int b1 = Integer.parseInt(y);
        int c1 = Integer.parseInt(m);
        int d1 = Integer.parseInt(d);
        System.out.println ("Меня зовут " + name + "\nЯ родился " + d + "." + m + "." + y);
    }
}
