import java.awt.*;
import javax.swing.JFrame;
import java.util.Scanner;

public class scaling00 extends Canvas {
    static int x1, y1, x2, y2, sx, sy;

    scaling00(int x1, int y1, int x2, int y2, int sx, int sy) {
        scaling00.x1 = x1;
        scaling00.y1 = y1;
        scaling00.x2 = x2;
        scaling00.y2 = y2;
        scaling00.sx = sx;
        scaling00.sy = sy;
    }

    public void paint(Graphics g) {
        int xn1, yn1, xn2, yn2;
        g.setColor(Color.blue);
        g.drawRect(x1, y1, x2, y2);
        xn1 = x1 * sx;
        yn1 = y1 * sy;
        xn2 = x2 * sx;
        yn2 = y2 * sy;
        g.setColor(Color.red);
        g.drawRect(xn1, yn1, xn2, yn2);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower left corner (x1,y1)");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter upper right corner (x2,y2)");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Enter Scaling factor (sx,sy)");
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        sc.close();
        scaling00 s = new scaling00(x1, y1, x2, y2, sx, sy);
        JFrame f = new JFrame();
        f.add(s);
        f.setSize(800, 800);
        f.setVisible(true);

    }
}
