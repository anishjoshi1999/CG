import java.awt.*;
import javax.swing.JFrame;
import java.util.Scanner;

public class rotation00 extends Canvas {
    static int x1, y1, x2, y2, angle;

    rotation00(int x1, int y1, int x2, int y2, int angle) {
        rotation00.x1 = x1;
        rotation00.y1 = y1;
        rotation00.x2 = x2;
        rotation00.y2 = y2;
        rotation00.angle = angle;
    }

    public void paint(Graphics g) {
        double xn1, yn1, xn2, yn2, ang;
        g.setColor(Color.blue);
        g.drawLine(x1, y1, x2, y2);
        ang = Math.toRadians(angle);
        xn1 = x1 * Math.cos(ang) - y1 * Math.sin(ang);
        yn1 = x1 * Math.sin(ang) + y1 * Math.cos(ang);
        xn2 = x2 * Math.cos(ang) - y2 * Math.sin(ang);
        yn2 = x2 * Math.sin(ang) + y2 * Math.cos(ang);
        g.setColor(Color.red);
        g.drawLine((int) Math.round(xn1), (int) Math.round(yn1), (int) Math.round(xn2), (int) Math.round(yn2));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first point (x1,y1)");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter last point (x2,y2)");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Enter the rotation angle");
        int angle = sc.nextInt();
        sc.close();
        rotation00 r0 = new rotation00(x1, y1, x2, y2, angle);
        JFrame f = new JFrame();
        f.add(r0);
        f.setSize(800, 800);
        f.setVisible(true);
    }

}
