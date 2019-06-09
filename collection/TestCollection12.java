package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection12 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println("集合中的数据:");
        System.out.println(numbers);

        Collections.swap(numbers,0,5);
        System.out.println("交换0和5下标的数据后，集合中的数据:");
        System.out.println(numbers);

    }
}