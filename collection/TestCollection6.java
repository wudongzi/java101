package collection;

import java.util.HashSet;

public class TestCollection6 {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<String>();

        names.add("gareen");

        System.out.println(names);

        names.add("gareen");
        System.out.println(names);
    }
}