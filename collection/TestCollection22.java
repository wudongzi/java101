package collection;

import java.util.ArrayList;

import charactor.Hero1;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        for (int i = 0; i < 5; i++) {
            //heros.add(new Hero1("hero " + i));
        }
       // Hero1 specialHero = new Hero1("special hero");
       // heros.add(specialHero);

        System.out.println(heros);
        System.out.println("把下标是5的元素，替换为\"hero 5\"");
        //heros.set(5, new Hero1("hero 5"));
        System.out.println(heros);
    }
}

