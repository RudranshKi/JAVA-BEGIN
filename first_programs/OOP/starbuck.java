package first_program.OOP;

public class starbuck {
    String make = "Starbucks";
    String founder = "Nun of your buisness";
    static int price = 2000;
    static void affordibility(int balance){
        if (balance >= price)
        System.out.println("Yes, you can have one cup");
        else 
        System.out.println("Come again poor");
            
    }
}
