package first_program.TEXTFIELD;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;

public class Button extends JButton{
    text_field tf = new text_field();
    Button(){
    this.setLayout(null);
    this.setBounds(50,50,100,100);
    this.setBackground(Color.RED);
    this.setText("Click me");
    }
}