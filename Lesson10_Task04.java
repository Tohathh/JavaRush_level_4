/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в одной строке не разделять.
*/

public class Lesson10_Task04 {
    public static void main(String[] args) {
        String s = "S";
        int i = 1;
        while (i <= 10) {
            System.out.println (s + s + s + s + s + s + s + s + s + s);
            i++;
        }
    }
}
