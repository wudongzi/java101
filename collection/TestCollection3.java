package collection;

import java.util.HashMap;

import charactor.Hero1;

public class TestCollection3 {
    public static void main(String[] args) {
        HashMap<String,Hero1> heroMap = new HashMap<String,Hero1>();

        //heroMap.put("gareen", new Hero1("gareen1"));
        System.out.println(heroMap);

        //heroMap.put("gareen", new Hero1("gareen2"));
        System.out.println(heroMap);

        heroMap.clear();
        //Hero1 gareen = new Hero1("gareen");

       // heroMap.put("hero1", gareen);
        //heroMap.put("hero2", gareen);

        System.out.println(heroMap);

    }
}