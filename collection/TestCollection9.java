package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection9 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println("集合中的数据:");
        System.out.println(numbers);

        Collections.reverse(numbers);

        System.out.println("翻转后集合中的数据:");
        System.out.println(numbers);

    }
}