package first_program.OOP.passing_objects_as_arguements;

public class main {
    public static void main(String[] args) {
        garage[] grg = new garage[3];
        car car1 = new car("Chevrolet");
        car car2 = new car("Ford");
        car car3 = new car("Tesla");

        garage grg1 = new garage(car1);
        grg1.park(car1);

    }
}
