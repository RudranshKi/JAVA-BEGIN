package first_program.layeredPANE;

import javax.swing.JLayeredPane;

public class layeredpane extends JLayeredPane {
    MyLabel ml1 = new MyLabel(50,50,200,200,253,0,0);
    MyLabel ml2 = new MyLabel(100,100,200,200,253,119,0);
    MyLabel ml3 = new MyLabel(150,150,200,200,253,119,255);
    layeredpane(){
        
        this.add(ml3);
        this.add(ml2);
        this.add(ml1);
        this.setBounds(0, 0, 960, 540);
    }
}
