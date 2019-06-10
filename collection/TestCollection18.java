package collection;

import java.util.ArrayList;

import charactor.Hero1;

public class TestCollection18 {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        for (int i = 0; i < 5; i++) {
            //heros.add(new Hero1("hero " + i));
        }
        //Hero1 specialHero = new Hero1("special hero");
        //heros.add(specialHero1);

        System.out.println(heros);

        System.out.print("虽然一个新的对象名字也叫 hero 1，但是contains的返回是:");
        //System.out.println(heros.contains(new Hero1("hero 1")));
        System.out.print("而对specialHero的判断，contains的返回是:");
        //System.out.println(heros.contains(specialHero));
    }

}