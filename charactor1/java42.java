package charactor1;
import charactor.java41;

public class java42 extends java41 {

    public void heal() {
        System.out.println("对自己进行治疗");
    }

    public void heal(java41 hero) {
        System.out.println("给英雄 " + hero + " 加血");
    }

    public void heal(java41 hero, int hp) {
        System.out.println("给英雄 " + hero + " 加了 " + hp + "点血");
    }
}