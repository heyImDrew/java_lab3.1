package Classes;

public class Game {
    private int year;
    private double rating;
    private String os;

    public Game(int year, double rating, String os) {
        this.year = year;
        this.rating = rating;
        this.os = os;
    }
    public int get_year() {
        return this.year;
    }
    public double get_rating() {
        return this.rating;
    }
    public String get_os() {
        return this.os;
    }
}
