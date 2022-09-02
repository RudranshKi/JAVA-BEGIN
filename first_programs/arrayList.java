package first_program;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        //It only synthesizes referece datatypes, and it is resizeable as opposed 
        //to normal array where the size is fixed

        numbers.add(12);
        numbers.add(17);
        numbers.add(69);
        numbers.add(56);
        numbers.add(100);
        numbers.set(3, 699);
        numbers.remove(4);

        for(int i=0;i<numbers.size();i++){  //in normal array we use number.length but in arraylist we use num.size()
            System.out.println(numbers.get(i));
        }




        
    }
}
