package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import charactor.Hero1;

public class TestCollection29 {

    public static void main(String[] args) {
        List<Hero1> heros = new ArrayList<Hero1>();

        for (int i = 0; i < 5; i++) {
            //heros.add(new Hero1("hero name " +i));
        }

        System.out.println("--------使用while的iterator-------");
        Iterator<Hero1> it= heros.iterator();

        while(it.hasNext()){
            Hero1 h = it.next();
            System.out.println(h);
        }
        System.out.println("--------使用for的iterator-------");
        for (Iterator<Hero1> iterator = heros.iterator(); iterator.hasNext();) {
            Hero1 hero = (Hero1) iterator.next();
            System.out.println(hero);
        }

    }

}