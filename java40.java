public class java40 {

    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public java40(){
    }
    public void huixue(int xp){
        hp = hp + xp;
        //回血完毕后，血瓶=0
        xp=0;
    }
    public java40(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
    public static void main(String[] args) {
        java40 teemo =  new java40("提莫",383);
        int xueping = 100;
        teemo.huixue(xueping);
        System.out.println(xueping);
        java40 garen = new java40("盖伦", 616);
        garen.attack(teemo, 100);
        System.out.println(teemo.hp);
    }
    public void attack(java40 hero, int damage) {
        hero.hp = hero.hp - damage;
    }
}
