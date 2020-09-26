package Classes.Main;
import Classes.*;

public class Main {
    public static void main(String[] args) {
        Shooter shooter = new Shooter(2005, 9.55, "Linux", 3, "AK");
        Quest quest = new Quest(2010, 8.4, "Windows", 18);
        Strategy strategy = new Strategy(2019, 9.83, "Mac OS", 5);
        strategy.create_map();
        strategy.create_map();
        strategy.create_map();
        Strategy strategy2 = new Strategy(2012, 7.13, "Mac OS", 2);
    }
}
