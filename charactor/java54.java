package charactor;

public class java54 {
    public String name;
    protected float hp;
    public static void battleWin(){
        System.out.println("hero battle win");
    }
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    public static void main(String[] args) {
        java54.battleWin();
        java54 h =new java54();
        h.battleWin();
        h= null;
        h.battleWin();
    }
}
