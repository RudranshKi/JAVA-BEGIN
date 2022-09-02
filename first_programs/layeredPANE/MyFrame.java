package first_program.layeredPANE;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    layeredpane lp = new layeredpane();
    MyFrame(){
        this.setTitle("Ah hoe Captain");
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); 
        this.setSize(960,540);
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("crab.png");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(123,0,250));
        this.add(lp);
    }
}
