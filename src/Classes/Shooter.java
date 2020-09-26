package Classes;

public class Shooter extends Game {
    private int levels;
    private String weapon;

    public Shooter(int year, double rating, String os, int levels, String weapon) {
        super(year, rating, os);
        this.levels = levels;
        this.weapon = weapon;

        System.out.println("** Шутер создан.");
        System.out.println("Год: " + this.get_year() + ". Рейтинг: " +
                this.get_rating() + ". ОС: " + this.get_os() +
                ". Кол-во уровней: " + this.get_levels() + ". Оружие: " + this.get_weapon() + ".");
        System.out.println();
    }
    public int get_levels() {
        return this.levels;
    }
    public String get_weapon() {
        return this.weapon;
    }
}
