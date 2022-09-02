package first_program.JFrame;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.event.*;

import java.awt.*;

public class MyPanel extends JPanel implements ActionListener{
 //   MyLabel label = new MyLabel();
    MyButton button;
    Border border = BorderFactory.createLineBorder(Color.green);
    MyPanel(){
 //       this.add(label);
        button = new MyButton();
        button.setBounds(220,120,100,100);
        button.addActionListener(this);
        this.setBackground(Color.RED);
        this.setBorder(border);
   
        this.setPreferredSize(new Dimension(200,200));
        this.add(button);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Don't touch me");
        
    }
}
