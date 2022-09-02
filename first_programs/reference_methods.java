package first_program;

import javax.swing.JOptionPane;

public class reference_methods {
    public static void main(String[] args) {
        String name= "Rudransh";
        String enter_name= JOptionPane.showInputDialog(null, "Enter name brotha");
        JOptionPane.showMessageDialog(null,name.equals(enter_name));
        JOptionPane.showMessageDialog(null,name.equalsIgnoreCase(enter_name)); //Ignores cases (upper or lower case) in string

        String number = new String();
        Integer num = 65;
    //    number = num.toString();  //since we have declared num as a reference data type, it allows us to use it tostring method
        JOptionPane.showMessageDialog(null,num);
        
    }
}
