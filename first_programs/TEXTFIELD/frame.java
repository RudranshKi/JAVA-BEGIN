package first_program.TEXTFIELD;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class frame extends JFrame{
    Panel panel;
    text_field tf = new text_field();
    frame(){
    this.setSize(new Dimension(960,540));
    this.setVisible(true);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    this.setBackground(Color.BLACK);
    this.setLayout(null);
    this.add(tf);
    panel = new Panel(tf.getText());
    this.add(panel);
    }
}