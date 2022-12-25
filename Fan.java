import java.awt.*;
import javax.swing.*;

public class Fan extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    setBackground(Color.WHITE);

    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

    int x = xCenter - radius;
    int y = yCenter - radius;

    g.setColor(Color.BLUE);
    g.fillArc(x, y, 2 * radius, 2 * radius, 0, 30);
    g.fillArc(x, y, 2 * radius, 2 * radius, 90, 30);
    g.fillArc(x, y, 2 * radius, 2 * radius, 180, 30);
    g.fillArc(x, y, 2 * radius, 2 * radius, 270, 30);

    g.setColor(Color.RED);
    g.fillArc(x, y, 2 * radius, 2 * radius, 30, 30);
    g.fillArc(x, y, 2 * radius, 2 * radius, 60, 30);
    g.fillArc(x, y, 2 * radius, 2 * radius, 120, 30);
    g.fillArc(x, y, 2 * radius, 2 * radius, 150, 30);
    g.fillArc(x, y, 2 * radius, 2 * radius, 210, 30);
    g.fillArc(x, y, 2 * radius, 2 * radius, 240, 30);
    g.fillArc(x, y, 2 * radius, 2 * radius, 300, 30);
    g.fillArc(x, y, 2 * radius, 2 * radius, 330, 30);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.add(new Fan());
    frame.setSize(300, 300);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
