package first_program.layeredPANE;

import javax.swing.JLabel;
import java.awt.*;

public class MyLabel extends JLabel{
    MyLabel(int x,int y,int width, int height, int a, int b , int c)
    {
        this.setOpaque(true);
        this.setBounds(x, y, width, height);
        this.setBackground(new Color(a,b,c));
    }
}

