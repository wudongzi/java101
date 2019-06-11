package collection;

import java.util.ArrayList;

import charactor.Hero1;

public class TestCollection26 {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        for (int i = 0; i < 5; i++) {
            //heros.add(new Hero("hero " + i));
        }

        System.out.println("ArrayList heros:\t" + heros);
        System.out.println("使用clear清空");
        heros.clear();
        System.out.println("ArrayList heros:\t" + heros);

    }
}