import java.awt.*;
import javax.swing.JFrame;
import java.util.Scanner;

public class MP_CIRCLE extends Canvas {
  static int xc, yc, r;

  MP_CIRCLE(int xc, int yc, int r) {
    MP_CIRCLE.xc = xc;
    MP_CIRCLE.yc = yc;
    MP_CIRCLE.r = r;
  }

  public void paint(Graphics g) {
    int x, y, p;
    x = 0;
    y = r;
    fill(g, x, y, xc, yc);
    p = 1 - r;
    while (x < y) {

      x = x + 1;
      if (p < 0) {
        p = p + 2 * x + 1;
      } else {
        y = y - 1;
        p = p + 2 * x + 1 - 2 * y;
      }
      fill(g, x, y, xc, yc);
    }

  }

  public void fill(Graphics g, int x, int y, int xc, int yc) {
    g.fillOval(xc + x, yc + y, 5, 5);
    g.fillOval(xc + x, yc - y, 5, 5);
    g.fillOval(xc - x, yc + y, 5, 5);
    g.fillOval(xc - x, yc - y, 5, 5);
    g.fillOval(xc + y, yc + x, 5, 5);
    g.fillOval(xc + y, yc - x, 5, 5);
    g.fillOval(xc - y, yc + x, 5, 5);
    g.fillOval(xc - y, yc - x, 5, 5);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter center (xc,yc): ");
    int xc = sc.nextInt();
    int yc = sc.nextInt();
    System.out.println("Enter radius r: ");
    int r = sc.nextInt();
    sc.close();
    MP_CIRCLE c = new MP_CIRCLE(xc, yc, r);
    JFrame f = new JFrame();
    f.add(c);
    f.setSize(800, 800);
    f.setVisible(true);
  }
}