package GUI;

import javax.swing.*;

public class SmileyTest {


    public static void main(String[] args) {
        Smiley panel = new Smiley();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.setVisible( true );
        application.add( panel );
        application.setSize( 500, 500 );



    }
}
