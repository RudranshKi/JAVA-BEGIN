package GameAssets.guiDragDrop;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    DragPanel dp = new DragPanel();
    MyFrame(){
    this.setSize(500,500);
    this.setVisible(true);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    this.setTitle("The return of vengence");
    this.setResizable(false);
    this.setLayout(null);
    this.getContentPane().setBackground(Color.BLACK);
    this.add(dp);
    }
}
