package first_program.JFrame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{   //inheriting JFrame class in java library
//    MyLabel label = new MyLabel();
    MyPanel panel = new MyPanel();
    MyFrame(){
        this.setTitle("Pirate king ship");
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); //important line since default close operation, doesn't exit the program
        this.setSize(960,540);
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("crab.png");
        this.setIconImage(icon.getImage());
       // this.getContentPane().setBackground(Color.BLACK);  //needs java.awt.* import for importing color method
        this.getContentPane().setBackground(new Color(123,0,250));

    //    this.add(label);
        this.add(panel);

    //    panel.setBounds(220, 120, 200, 200);
    }
}
