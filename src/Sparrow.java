import java.awt.*;

public class Sparrow extends Bird {
    public static int maxX = -300;
    public static int maxY = -300;
    public static int minX = 300;
    public static int minY = 300;
    private static String name;
    private static int num = 0;

    public Sparrow(String name, int x, int y) {
        this.x = x;
        this.y = y;
        color = Color.magenta;
        Size = 7;
        this.name = name;
        System.out.println("Я воробей " + name + "!");
        num++;
        System.out.println("Я воробей № " + num);
    }
}
