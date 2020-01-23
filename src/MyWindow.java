import javax.swing.*;
import java.awt.*;
public class MyWindow extends JFrame {
    public static final int WIDTHWIN = 800;
    public static final int HEIGHTWIN = 800;
    private Flock f;
    public MyWindow(Flock f) {
        this.f = f;
        this.setTitle("Window");
        this.setSize(WIDTHWIN, HEIGHTWIN);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    @Override public void paint(Graphics g) {
        g.translate(WIDTHWIN/2,HEIGHTWIN/2);
        g.drawLine(-HEIGHTWIN/2, 0, HEIGHTWIN/2, 0);
        g.drawLine(0, -WIDTHWIN/2, 0, WIDTHWIN/2);
        f.draw(g);
    }
}
/*


import javax.swing.*;
import java.awt.*;
public class MyWindow extends JFrame {
    private Flock f;
    public static final int WIDTHWIN = 600;
    public static final int HEIGHTWIN = 600;
    public MyWindow(Flock f) {
        this.f = f;
        this.setTitle("Window");
        this.setSize(WIDTHWIN, HEIGHTWIN);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    @Override public void paint(Graphics g) {
        g.translate(300,300);
        g.drawLine(-300, 0, 300, 0);
        g.drawLine(0, -300, 0, 300);
        f.draw(g);
    }
}
 */