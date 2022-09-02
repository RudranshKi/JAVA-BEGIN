package GameAssets.guiDragDrop;

import javax.swing.*;

import java.awt.*;

public class DragPanel extends JPanel{
    ImageIcon image = new ImageIcon("rocket12.png");
    int width = image.getIconWidth();
    int height = image.getIconHeight();
    Point imageCorner;
    Point prevPT;
    DragPanel(){
        imageCorner = new Point(20,20);
        this.setLayout(null);
        ClickListener CL = new ClickListener(prevPT);
        DragListener DL = new DragListener();
        this.addMouseListener(CL);
        this.addMouseMotionListener(DL);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
    }
}
