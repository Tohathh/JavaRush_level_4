/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Lesson13_Task03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int j = 1;
            while (j<i+1) {
                System.out.print(8);
                j++;
            }
            System.out.println("");
        }
    }
}
