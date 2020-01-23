import java.awt.*;
public class Penguin extends Bird {
    public static int maxX = -300;
    public static int maxY = -300;
    public static int minX = 300;
    public static int minY = 300;
    public static String name;
    private static int num = 0;

    public static void fly() {
        System.out.println("Я не умею летать");
    }
    public Penguin(String name, int x, int y) {
        this.x = x;
        this.y = y;
        color = Color.blue;
        Size = 25;
        this.name = name;
        System.out.println("Я пингвин " + name + "!");
        num++;
        System.out.println("Я пингвин № " + num);
    }
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x , y , Size, Size);
        g.setColor(Color.black);
        g.fillOval(x+3, y+3, Size-7, Size-7);
    }
}