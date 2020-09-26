package Classes;

public class Strategy extends Game {
    private int max_unit;
    public static int amount_of_maps = 0;

    public Strategy(int year, double rating, String os, int max_unit) {
        super(year, rating, os);
        this.max_unit = max_unit;

        System.out.println("** Стратегия создана.");
        System.out.println("Год: " + this.get_year() + ". Рейтинг: " +
                this.get_rating() + ". ОС: " + this.get_os() +
                ". Максимальное кол-во юнитов: " + this.get_max_units() +
                ". Количество карт: " + this.get_amount_of_maps() + ".");
        System.out.println();
    }
    public void create_map() {
        amount_of_maps++;
        System.out.println("** Карта для стратегии создана.\n");
    }
    public int get_max_units() {
        return this.max_unit;
    }
    public int get_amount_of_maps() {
        return amount_of_maps;
    }
}
