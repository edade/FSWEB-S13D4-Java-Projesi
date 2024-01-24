import model.Player;
import model.Point;
import model.Weapon;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        System.out.println("*************");

        Player player = new Player("EDA", 100, Weapon.KNIFE);
        System.out.println("healthRemaining: " + player.healthRemaining());
        player.loseHealth(30);
        System.out.println("healthRemaining: " + player.healthRemaining());
        player.restoreHealth(20);
        System.out.println("healthRemaining: " + player.healthRemaining());
    }
}