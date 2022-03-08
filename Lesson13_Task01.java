/* Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/

public class Lesson13_Task01 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }
}
