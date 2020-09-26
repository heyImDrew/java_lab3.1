package Classes;

public class Quest extends Game {
    private int age;

    public Quest(int year, double rating, String os, int age) {
        super(year, rating, os);
        this.age = age;

        System.out.println("** Квест создан.");
        System.out.println("Год: " + this.get_year() + ". Рейтинг: " +
                this.get_rating() + ". ОС: " + this.get_os() +
                    ". Возраст: " + this.get_age() + ".");
        System.out.println();
    }
    public int get_age() {
        return this.age;
    }
}
