import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Flock {
    static final int MAXSIZEBIRD = 25;
    private ArrayList<Bird> flock;
    // only birds, w/o lines (rectangles)
    /*public void draw (Graphics g) {
        for(int i = 0; i<flock.size();i++) {
            flock.get(i).draw(g);
        }
    }*/
    public void fly() {
        for(int i = 0; i<flock.size();i++) {
            flock.get(i).fly();
        }
    }
    public Flock(int n) {
        flock = new ArrayList < Bird > (n);
        Scanner s = new Scanner(System.in);
        System.out.println("1 - name Macaw, 2 - name Penguin, 3 - name Sparrow, 4 - exit");
        int type = 1;
        while (type != 4) {
            type = s.nextInt();
            int x, y;
            do {
                x = (int)(Math.random() * 10000 % (MyWindow.WIDTHWIN - 100) - (MyWindow.WIDTHWIN / 2 - 50));
                y = (int)(Math.random() * 10000 % (MyWindow.HEIGHTWIN - 100) - (MyWindow.HEIGHTWIN / 2 - 50));
            } while (isThere(x, y));

            if (type == 1) {
                flock.add(new Macaw(ID.nameMacaw.id[(int)((Math.random() * (5 - 0 + 1) + 0))], x, y));
                if(Macaw.maxX < x) Macaw.maxX = x;
                if(Macaw.maxY < y) Macaw.maxY = y;
                if(Macaw.minX > x) Macaw.minX = x;
                if(Macaw.minY > y) Macaw.minY = y;
            }
            if (type == 2) {
                flock.add(new Penguin(ID.namePenguin.id[(int)((Math.random() * (5 - 0 + 1) + 0))], x, y));
                if(Penguin.maxX < x) Penguin.maxX = x;
                if(Penguin.maxY < y) Penguin.maxY = y;
                if(Penguin.minX > x) Penguin.minX = x;
                if(Penguin.minY > y) Penguin.minY = y;
            }
            if (type == 3) {
                flock.add(new Sparrow(ID.nameSparrow.id[(int)((Math.random() * (5 - 0 + 1) + 0))], x, y));
                if(Sparrow.maxX < x) Sparrow.maxX = x;
                if(Sparrow.maxY < y) Sparrow.maxY = y;
                if(Sparrow.minX > x) Sparrow.minX = x;
                if(Sparrow.minY > y) Sparrow.minY = y;
            }
        }

    }
    public boolean isThere(int x, int y){
        for (int i = 0; i < flock.size(); i++) {
            if(x >= flock.get(i).x - MAXSIZEBIRD && x <= flock.get(i).x + MAXSIZEBIRD
                    && y >= flock.get(i).y - MAXSIZEBIRD && y <= flock.get(i).y + MAXSIZEBIRD) return true;
        }
        return false;
    }


    public void draw(Graphics g){
        for (int i = 0; i < flock.size(); i++){
            flock.get(i).draw(g);
            g.setColor(Color.GREEN);
            g.drawLine(Macaw.minX, Macaw.minY, Macaw.maxX + 10, Macaw.minY);
            g.drawLine(Macaw.minX, Macaw.minY, Macaw.minX, Macaw.maxY + 10);
            g.drawLine(Macaw.maxX + 10, Macaw.maxY + 10, Macaw.minX, Macaw.maxY + 10);
            g.drawLine(Macaw.maxX + 10, Macaw.maxY + 10, Macaw.maxX + 10, Macaw.minY);
            g.setColor(Color.BLUE);
            g.drawLine(Penguin.minX, Penguin.minY, Penguin.maxX + 25, Penguin.minY);
            g.drawLine(Penguin.minX, Penguin.minY, Penguin.minX, Penguin.maxY + 25);
            g.drawLine(Penguin.maxX + 25, Penguin.maxY + 25, Penguin.minX, Penguin.maxY + 25);
            g.drawLine(Penguin.maxX + 25, Penguin.maxY + 25, Penguin.maxX + 25, Penguin.minY);
            g.setColor(Color.GRAY);
            g.drawLine(Sparrow.minX, Sparrow.minY, Sparrow.maxX + 7, Sparrow.minY);
            g.drawLine(Sparrow.minX, Sparrow.minY, Sparrow.minX, Sparrow.maxY + 7);
            g.drawLine(Sparrow.maxX + 7, Sparrow.maxY + 7, Sparrow.minX, Sparrow.maxY + 7);
            g.drawLine(Sparrow.maxX + 7, Sparrow.maxY + 7, Sparrow.maxX + 7, Sparrow.minY);
        }
    }
}