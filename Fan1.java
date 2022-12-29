import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fan1 extends JPanel {

    FanPanel() {
        setPreferredSize(new Dimension(400, 400));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Create the fan blade
        Path2D.Double blade = new Path2D.Double();
        blade.moveTo(0, 0);
        blade.lineTo(100, 0);
        blade.lineTo(80, 200);
        blade.lineTo(20, 200);
        blade.closePath();

        // Rotate the blade to create three blades
        AffineTransform reset = g2d.getTransform();
        g2d.translate(200, 200);
        g2d.rotate(Math.toRadians(-120));
        for (int i = 0; i < 3; i++) {
            g2d.fill(blade);
            g2d.rotate(Math.toRadians(120));
        }
        g2d.setTransform(reset);

        // Draw the center of the fan
        g2d.setColor(Color.BLACK);
        g2d.fillOval(175, 175, 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new FanPanel());
        frame.pack();
        frame.setVisible(true);
    }
}