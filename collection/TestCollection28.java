package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import charactor.Hero1;

public class TestCollection28 {

    public static void main(String[] args) {
        List<Hero1> heros = new ArrayList<Hero1>();

        for (int i = 0; i < 5; i++) {
            //heros.add(new Hero1("hero name " + i));
        }

        System.out.println("--------for 循环-------");
        for (int i = 0; i < heros.size(); i++) {
            Hero1 h = heros.get(i);
            System.out.println(h);
        }

    }

}