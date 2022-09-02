package first_program.TEXTFIELD;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JPanel;

public class Panel extends JPanel implements ActionListener{
    Button button = new Button();
    String text;
    Panel(String text){
    this.setBounds(25,25,200,200);
    this.setLayout(null);
    this.add(button);
    button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println("HELLO "+text);
        } 
    }
}