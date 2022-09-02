package first_program.Array;

public class array {
    public static void main(String[] args) {
        String make, name;
        int year_make;

        showroom[] srm = new showroom[3]; // you can make array of objects too
        showroom ford = new showroom("FORD","MUSTANG GT",2017);
        showroom chevrolet = new showroom("CHEVROLET","CORVETTE 2018 GRAND SPORT",2018);

        srm[0] = ford;
        srm[1] = chevrolet;

        System.out.println(srm[1].make);

    }
}
