package GameAssets.guiMouseListener;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements MouseListener{
    MyLabel label;
MyFrame(){
    label = new MyLabel();
    this.setSize(700,700);
    this.setVisible(true);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    this.setTitle("The return of vengence");
    this.setResizable(false);
    this.setLayout(null);
    this.addMouseListener(this);
    this.add(label);
    this.getContentPane().setBackground(Color.BLACK);
}
@Override
public void mouseClicked(MouseEvent e) {   
    label.setBackground(Color.RED);
}
@Override
public void mousePressed(MouseEvent e) {  
    label.setBackground(Color.YELLOW);
}
@Override
public void mouseReleased(MouseEvent e) { 
    label.setBackground(Color.PINK); 
}
@Override
public void mouseEntered(MouseEvent e) {   
    label.setBackground(Color.BLUE);
}
@Override
public void mouseExited(MouseEvent e) {  
    label.setBackground(Color.MAGENTA);
}
}
