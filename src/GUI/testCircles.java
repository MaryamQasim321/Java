package GUI;

import javax.swing.*;

public class testCircles {
    public static void main(String[] args) {


        ConcentricCircles panel =new ConcentricCircles(  );
        JFrame application = new JFrame();

        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.setSize( 500,500 );
        application.add( panel );
        application.setVisible( true );
    }
}
