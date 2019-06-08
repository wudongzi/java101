package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import charactor.Hero1;

public class TestCollection4 {
    public static void main(String[] args) {
        List<Hero1> heros = new ArrayList<Hero1>();

        for (int j = 0; j < 2000000; j++) {
            //Hero1 h = new Hero1("Hero1 " + j);
            //heros.add(h);
        }

        for (int i = 0; i < 10; i++) {

            Collections.shuffle(heros);

            long start = System.currentTimeMillis();

            String target = "Hero 1000000";

            for (Hero1 hero : heros) {
                if (hero.name.equals(target)) {
                    System.out.println("找到了 hero!" );
                    break;
                }
            }
            long end = System.currentTimeMillis();
            long elapsed = end - start;
            System.out.println("一共花了：" + elapsed + " 毫秒");
        }

    }
}