package GUI;
import javax.swing.*;
import java.awt.*;
public class ConcentricCircles extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent( g );
            int width= getWidth() / 2;
            int height = getHeight() / 2;
            int initialRadius = 20;

            for (int i = 0; i < 10; i++) {
                int circleRadius = initialRadius + i * 10;
                int x = width- circleRadius;
                int y = height - circleRadius;
                g.drawOval(x, y, 2 * circleRadius, 2 * circleRadius);
            }
    }
}
