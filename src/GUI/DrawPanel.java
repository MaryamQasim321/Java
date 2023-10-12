package GUI;
import java.awt.Graphics;
import  javax.swing.JPanel;

public class DrawPanel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent( g );

        int width=getWidth();
        int height=getHeight();

        int one_height=height/30;
        int one_width=width/30;
        for(int i=1; i<=30; i++) {
            g.drawLine( 0, 0,width-(one_width*i) , one_height*i);
            g.drawLine( one_height*i, width-(one_width*i), 0, 0);
            g.drawLine(0 , width-(one_width*i),one_height*i , 0);
        }


    }


}
