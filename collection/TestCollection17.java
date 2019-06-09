package collection;

import java.util.ArrayList;

import charactor.Hero1;

public class TestCollection17 {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        for (int i = 0; i < 5; i++) {
            //heros.add(new Hero1("hero1 " + i));
        }
        System.out.println(heros);

        //Hero1 specialHero = new Hero1("special hero");
        //heros.add(3, specialHero);

        System.out.println(heros.toString());

    }

}