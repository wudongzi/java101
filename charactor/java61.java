package charactor;

public abstract class java61 {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public abstract void attack();

    public static void main(String[] args) {

        //java61 adh=new java61();

        //adh.attack();
        //System.out.println(adh);

        java61 h = new java61(){

            public void attack() {
                System.out.println("新的进攻手段");
            }
        };
        h.attack();

        System.out.println(h);
    }

}
