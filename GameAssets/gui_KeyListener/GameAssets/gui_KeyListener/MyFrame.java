package GameAssets.gui_KeyListener;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrame extends JFrame implements KeyListener{
    MyLabel label;
MyFrame(){
    label = new MyLabel();
    this.setSize(960,720);
    this.setVisible(true);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    this.setTitle("The return of vengence");
    this.setResizable(false);
    this.setLayout(null);
    this.addKeyListener(this);
    this.add(label);
    this.getContentPane().setBackground(Color.BLACK);
}
    @Override
    public void keyTyped(KeyEvent e) {   
    }

    @Override
    public void keyPressed(KeyEvent e) { 
        switch (e.getKeyCode()){
            case 37 : label.setLocation(label.getX()-10, label.getY());
            checkerLEFT();
            System.out.println(label.getX()+" , "+label.getY());
            break;
            case 38 : label.setLocation(label.getX()   , label.getY()-10);
            checkerTOP();
            System.out.println(label.getX()+" , "+label.getY());
            break;
            case 39 : label.setLocation(label.getX()+10, label.getY());
            checkerRIGHT();
            System.out.println(label.getX()+" , "+label.getY());
            break;
            case 40 : label.setLocation(label.getX()   , label.getY()+10);
            checkerBOTTOM();
            System.out.println(label.getX()+" , "+label.getY());
            break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {   
    }
    
    void checkerLEFT(){
        if (label.getLocation().getX() < 0){
            label.setLocation(0, label.getY());
        }
    }
    void checkerRIGHT(){
        if ((label.getX()) > 900){
            label.setLocation(900, label.getY());
        }
    }
    void checkerBOTTOM(){
        if ((label.getY()+ 50) > 630){
            label.setLocation(label.getX(),630);
        }
    }
    void checkerTOP(){
        if (label.getLocation().getY() < 0){
            label.setLocation(label.getX(),0);
        }
    }
}
