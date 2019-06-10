package collection;

import java.util.ArrayList;

import charactor.Hero1;

public class TestCollection20 {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        for (int i = 0; i < 5; i++) {
            //heros.add(new Hero("hero " + i));
        }
        //Hero specialHero = new Hero("special hero");
        //heros.add(specialHero);

        System.out.println(heros);
        //System.out.println("specialHero所处的位置:"+heros.indexOf(specialHero));
        //System.out.println("新的英雄，但是名字是\"hero 1\"所处的位置:"+heros.indexOf(new Hero("hero 1")));

    }
}