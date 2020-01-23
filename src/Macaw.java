import java.awt.*;
public class Macaw extends Bird {
    public static int maxX = -300;
    public static int maxY = -300;
    public static int minX = 300;
    public static int minY = 300;
    private static String name;
    private static int num = 5;

    public Macaw(String name, int x, int y) {
        this.x = x;
        this.y = y;
        color = Color.green;
        Size = 10;
        this.name = name;
        System.out.println("Я попугай " + name + "!");
        num++;
        System.out.println("Я попугай № " + num);
    }
}