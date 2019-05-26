package charactor;

public class java44 {
    public String name;
    protected float hp;

    public void die(){
        hp = 0;
    }

    public static void battleWin(){
        System.out.println("battle win");
    }
    public static void main(String[] args) {
        java44 garen =  new java44();
        garen.name = "盖伦";
        garen.die();
        java44 teemo =  new java44();
        teemo.name = "提莫";
        java44.battleWin();
    }
    //garen.battleWin();
    //Hero.battleWin();
    //Math.random()
}
