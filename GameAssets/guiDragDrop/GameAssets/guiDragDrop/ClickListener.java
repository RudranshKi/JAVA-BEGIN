package GameAssets.guiDragDrop;
import java.awt.event.*;
import java.awt.*;
public class ClickListener extends MouseAdapter{
    Point prevPT;
    ClickListener(Point prevPT){
        this.prevPT = prevPT;
    }
    public void mousePressed(MouseEvent e){
        prevPT = e.getPoint();
    }
}
