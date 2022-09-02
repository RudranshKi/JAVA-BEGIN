package first_program;

import java.util.ArrayList;

public class for_each_loop {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(12);
        numbers.add(17);
        numbers.add(69);
        numbers.add(56);
        numbers.add(100);
        
        for(Integer i : numbers){   // for-each loop iterates through all the elements in an collection or array,
            // (Integer) = data type of the array/collection/arraylist, 
            //i = for counting, numbers= collection/array name
            System.out.println(i);

        }
    }
}
