import java.awt.*;
public class Bird {
    protected int x=(int) (Math.random() * 550);
    protected int y=(int) (Math.random() * 550);
    protected Color color = Color.black;
    protected int Size = 10;
    public Bird() {
        System.out.println(" Я птица! ");
    }
    public static void fly() {
        System.out.println(" Я лечу! ");
    }
    public void draw(Graphics g) {
        //int pos = 0;
        //pos = pos + 50;
        g.setColor(color);
        g.fillOval(x , y , Size, Size);
    }
}