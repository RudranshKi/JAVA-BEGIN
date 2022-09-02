package first_program;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name bro");
        String name = sc.nextLine();
        System.out.println("Enter your age bro");
        int age = sc.nextInt();
        sc.nextLine();  //to clear the scanner of any escape sequence after previous line execution or else it won't execute the next line
        System.out.println("Eneter your favourite food bro");
        String food = sc.nextLine();

        System.out.println("Your name is "+name+" age "+age+" .favourite food - "+food);
        sc.close();
        
    }
}
