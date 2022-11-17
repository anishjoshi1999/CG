import java.awt.*;
import javax.swing.JFrame;
import java.util.Scanner;

public class Translation extends Canvas {
    static int x, y, tx, ty;

    Translation(int x, int y, int tx, int ty) {
        Translation.x = x;
        Translation.y = y;
        Translation.tx = tx;
        Translation.ty = ty;
    }

    public void paint(Graphics g) {
        int xn, yn;
        g.setColor(Color.blue);
        g.fillOval(x, y, 10, 10);
        xn = x + tx;
        yn = y + ty;
        g.setColor(Color.red);
        g.fillOval(xn, yn, 10, 10);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter point (x,y): ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Enter Translation vector: ");
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        sc.close();
        Translation t = new Translation(x, y, tx, ty);
        JFrame f = new JFrame();
        f.add(t);
        f.setSize(800, 800);
        f.setVisible(true);

    }

}
