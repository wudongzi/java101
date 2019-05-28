package charactor;

public abstract class java62 {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public abstract void attack();

    public static void main(String[] args) {

        class SomeHero extends java62{
            public void attack() {
                System.out.println( name+ " 新的进攻手段");
            }
        }

        SomeHero h  =new SomeHero();
        h.name ="地卜师";
        h.attack();
    }

}