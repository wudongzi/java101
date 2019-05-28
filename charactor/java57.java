package charactor;

import property.Weapon;

public class java57 extends Object {

    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public final void useItem(java57 i){
        System.out.println("hero use item");
        //i.effect();
    }

    public java57(){
        System.out.println("Hero的无参的构造方法 ");
    }

    public java57(String name){
        System.out.println("Hero的有一个参数的构造方法 ");
        this.name = name;
    }

    public static void main(String[] args) {
        new java57();
    }

}