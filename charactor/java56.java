package charactor;

import property.Weapon;

public class java56 extends Object {

    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public void useItem(java56 i){
        System.out.println("hero use java56");
        //i.effect();
    }

    public java56(){
        System.out.println("Hero的无参的构造方法 ");
    }

    public java56(String name){
        System.out.println("Hero的有一个参数的构造方法 ");
        this.name = name;
    }
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        java56 h = new java56();
        h.name = "盖伦";
        System.out.println(h.toString());
        System.out.println(h);
    }

    public void finalize(){
        System.out.println("这个英雄正在被回收");
    }

    public boolean equals(Object o){
        if(o instanceof java56){
            java56 h = (java56) o;
            return this.hp == h.hp;
        }
        return false;
    }

}