public class Cat {
    private String name;
    private static int catsCount = 0;
    private String fullName;
    /*
    Реализовать метод setName,
    чтобы с его помощью можно было устанавливать значение переменной
    private String name равное переданному параметру String name.
     */
    public void setName(String name) {
        this.name = name;
    }
    /*
    Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота),
    количество котов увеличивалось на 1.
    За количество котов отвечает переменная catsCount.
    */
    public static void addNewCat() {
        int addNewCat = catsCount++;
    }

    /*
     Реализовать метод setCatsCount так, чтобы с его помощью можно было устанавливать значение
     переменной catsCount равное переданному параметру.
    */
    public static void setCatsCount(int catsCount) {
        Cat.catsCount = catsCount;
    }
    /*
    Реализовать метод setName, чтобы с его помощью можно было устанавливать значение
    переменной private String fullName равное значению локальной переменной String fullName.
    */
    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;
    }
    /*
    Написать код, чтобы правильно считалось количество созданных
    котов (count) и на экран выдавалось правильно их количество.
    */
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1();
        Cat1.count ++;
        Cat1 cat2 = new Cat1();
        Cat1.count ++;
        System.out.println("Cats count is " + Cat1.count);
    }
    public static class Cat1
    {
        public static int count = 0;
    }
}


