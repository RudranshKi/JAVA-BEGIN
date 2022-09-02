package first_program.OOP;

import java.util.Scanner;

public class coffee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your available balance");
        int balance =sc.nextInt();
        System.out.println("Enter your preffered option:-");
        System.out.println("1.Starbucks");
        System.out.println("2.CoffeIndia");
        int choice =sc.nextInt();

        // starbuck stb = new starbuck();  //alternate way to call a class

        switch (choice){
            case 1: 
            System.out.println("Price- "+starbuck.price);
            starbuck.affordibility(balance);
            
            break;
            case 2: 
            System.out.println("Price- "+coffeIndia.price);
            coffeIndia.affordibility(balance);
            break;
        }
    }
}
