package org.paumard;



import javax.swing.event.ListSelectionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 *
 * @author ehis
 */
public class Main {

    public static int reduce (List<Integer> values, int valueIfEmpty, BinaryOperator<Integer> reduction) {

        int result = valueIfEmpty;
        for (int value : values) {
            result = reduction.apply(result, value);
        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> ints1 = Arrays.asList(0, 1, 2, 3, 4);
        List<Integer> ints2 = Arrays.asList(5, 6, 7, 8, 9);

       // BinaryOperator<Integer> op = (i1, i2) -> i1 + i2 ;
        BinaryOperator<Integer> op = (i1, i2) -> Integer.max(i1,i2);

        int reduction1 = reduce(ints1, 0, op);
        int reduction2 = reduce(ints2, 0, op);
        int reduction = reduce(Arrays.asList(reduction1, reduction2), 0, op);
         //int reduction = reduce(ints, 0, op);

        System.out.println("Reduction : " + reduction);


        //easiest way
        Person person1 = new Person("Jude", 19);
        Person person2 = new Person("Ehis", 76);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);

//        int avg = personList.stream()
//                            .map(p -> p.getAge())
//                            .filter(age -> age > 20)
//                            .average();
    }
}
