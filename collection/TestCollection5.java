package collection;

import java.util.HashMap;

import charactor.Hero1;

public class TestCollection5 {
    public static void main(String[] args) {

        HashMap<String,Hero1> heroMap = new HashMap<String,Hero1>();
        for (int j = 0; j < 2000000; j++) {
            //Hero1 h = new Hero1("Hero " + j);
            //heroMap.put(h.name, h);
        }
        System.out.println("数据准备完成");

        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();


            Hero1 target = heroMap.get("Hero 1000000");
            System.out.println("找到了 hero!" + target.name);

            long end = System.currentTimeMillis();
            long elapsed = end - start;
            System.out.println("一共花了：" + elapsed + " 毫秒");
        }

    }
}