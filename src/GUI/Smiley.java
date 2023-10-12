package GUI;

import javax.swing.*;
import java.awt.*;

public class Smiley extends JPanel{

        public void paintComponent(Graphics g){
            int height=getHeight()/2;
            int width=getWidth()/2;
            g.setColor( Color.YELLOW );
            g.fillOval( width, height, 200, 200 );


            g.setColor( Color.BLACK );
            g.fillOval( width+45,height+55,30,30 );
            g.fillOval( width+125, height+55, 30, 30 );

            g.fillOval(width+40, width+100, 120, 60);

            g.setColor( Color.YELLOW);
//            g.fillRect(width+40, height+100, 120, 30  );
            g.fillOval( width+40, height+100, 130, 50 );


        }
}
