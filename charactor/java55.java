package charactor;

import charactor.java51;

public class java55 {

    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public void useItem(java51 i){
        System.out.println("hero use item");
        i.effect();
    }

    public java55(){
        System.out.println("Hero的构造方法 ");
    }

    public static void main(String[] args) {
        new java55();
    }
    public java55(String name){
        this.name = name;
    }

}