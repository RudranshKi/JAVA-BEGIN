package first_program.OOP;

public class coffeIndia {
    String make = "CoffeeIndia";
    String founder = "Nun of your buisness";
    static int price = 200;
    static void affordibility(int balance){
        if (balance >= price)
        System.out.println("Yes, you can have one of our elite cup");
        else 
        System.out.println("Pathetic");
    }
}
