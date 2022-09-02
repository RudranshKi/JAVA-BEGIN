package GameAssets.gui_KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyLabel extends JLabel{
    ImageIcon icon;
    MyLabel(){      
        this.setLayout(null);
        icon = new ImageIcon("crab.png"); 
        this.setBounds(20,20,50,50);
        this.setIcon(icon);
        this.setOpaque(true);
    }
}
