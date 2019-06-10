package collection;

import java.util.ArrayList;

import charactor.Hero1;

public class TestCollection21 {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        for (int i = 0; i < 5; i++) {
            //heros.add(new Hero("hero " + i));
        }
        //Hero specialHero = new Hero("special hero");
        //heros.add(specialHero);

        System.out.println(heros);
        heros.remove(2);
        System.out.println("删除下标是2的对象");
        System.out.println(heros);
        System.out.println("删除special hero");
        //heros.remove(specialHero);
        System.out.println(heros);

    }
}