package first_program;

import javax.swing.JOptionPane;

public class Gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name bro");
        JOptionPane.showMessageDialog(null,"Hello "+name+" bro");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age bro")); 
        //we have to use parseint method since joptionpane only accepts and stores string variable,
        // so we would have to parse it to int or any format we like 
        JOptionPane.showMessageDialog(null,"You're "+age+" old, bro");


    }
}
