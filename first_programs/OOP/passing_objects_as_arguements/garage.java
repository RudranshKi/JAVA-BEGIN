package first_program.OOP.passing_objects_as_arguements;

public class garage {
    String name;
    car Car = new car(name);
    garage(car Car){
        this.Car= Car;
    }
    void park(car Car){
        System.out.println(Car.name+" is parked in the garage");
    }
}
