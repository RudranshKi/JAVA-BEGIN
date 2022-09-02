package first_program;

import java.util.ArrayList;

public class Two_DArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> List = new ArrayList();

        ArrayList<String> numbers= new ArrayList<>();
        numbers.add("12");
        numbers.add("17");
        numbers.add("69");
        numbers.add("56");
        numbers.add("100");

        ArrayList<String> names= new ArrayList<>();

        names.add("Raja");
        names.add("Rudransh");
        names.add("Dudulu");
        names.add("Fenix");
        names.add("Fenyrking");

        List.add(names);
        List.add(numbers);

        System.out.println(List);
    }
}
