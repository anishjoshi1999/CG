import java.awt.*;
import javax.swing.JFrame;
import java.util.Scanner;

public class Translation1 extends Canvas {

    static int x1, y1, x2, y2, tx, ty;

    Translation1(int x1, int y1, int x2, int y2, int tx, int ty) {
        Translation1.x1 = x1;
        Translation1.y1 = y1;
        Translation1.x2 = x2;
        Translation1.y2 = y2;
        Translation1.tx = tx;
        Translation1.ty = ty;
    }

    public void paint(Graphics g) {
        int xn1, yn1, xn2, yn2;
        g.setColor(Color.blue);
        g.drawLine(x1, y1, x2, y2);
        xn1 = x1 + tx;
        yn1 = y1 + ty;
        xn2 = x2 + tx;
        yn2 = y2 + ty;
        g.setColor(Color.red);
        g.drawLine(xn1, yn1, xn2, yn2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first point (x1,y1): ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter second point (x2,y2): ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Enter translation vector (tx,ty): ");
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        sc.close();
        Translation1 t1 = new Translation1(x1, y1, x2, y2, tx, ty);
        JFrame f = new JFrame();
        f.add(t1);
        f.setSize(800, 800);
        f.setVisible(true);
    }
}
