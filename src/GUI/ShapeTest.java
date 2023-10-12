package GUI;


import javax.swing.*;

public class ShapeTest {
    public static void main(String[] args) {
        String input= JOptionPane.showInputDialog(
                "Enter 1 to draw raectangle"+"Enter 2 to draw oval."
        );
        int choice = Integer.parseInt( input );

        Shapes panel =new Shapes( choice );
        JFrame application = new JFrame();

        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.setSize( 500,500 );
        application.add( panel );
        application.setVisible( true );
    }
}
