import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class Cube extends JPanel {
  private static final int SIZE = 50;
  private static final int SPACING = 10;
  private static final int NUM_CUBES = 5;

  private static final int ROTATION_ANGLE = 15;

  private int rotation = 0;

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D)g;

    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                         RenderingHints.VALUE_ANTIALIAS_ON);

    g2d.translate(getWidth() / 2, getHeight() / 2);
    g2d.rotate(Math.toRadians(rotation));

    for (int i = 0; i < NUM_CUBES; i++) {
      g2d.setColor(Color.BLUE);
      g2d.fill(new Rectangle2D.Double(-SIZE / 2, -SIZE / 2, SIZE, SIZE));

      g2d.setColor(Color.YELLOW);
      g2d.fill(new Rectangle2D.Double(-SIZE / 2, -SIZE / 2 - SPACING - SIZE, SIZE, SIZE));

      g2d.setColor(Color.RED);
      g2d.fill(new Rectangle2D.Double(-SIZE / 2 - SPACING - SIZE, -SIZE / 2, SIZE, SIZE));

      g2d.setColor(Color.GREEN);
      g2d.fill(new Rectangle2D.Double(-SIZE / 2, -SIZE / 2 + SPACING + SIZE, SIZE, SIZE));

      g2d.setColor(Color.ORANGE);
      g2d.fill(new Rectangle2D.Double(-SIZE / 2 + SPACING + SIZE, -SIZE / 2, SIZE, SIZE));

      g2d.rotate(Math.toRadians(60));
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    final Cube panel = new Cube();
    frame.add(panel);
    frame.setSize(300, 300);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Timer timer = new Timer(50, new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        panel.rotation += ROTATION_ANGLE;
        panel.repaint();
      }
    });
    timer.start();
  }
}
