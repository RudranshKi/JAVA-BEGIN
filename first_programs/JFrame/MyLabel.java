package first_program.JFrame;

import javax.swing.*;

public class MyLabel extends JLabel{
    ImageIcon image = new ImageIcon("tiger.jpg");
    MyLabel(){
        this.setText("Crysis");
        this.setIcon(image);
    }
}
