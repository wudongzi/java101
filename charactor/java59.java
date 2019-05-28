package charactor;

public class java59 {
    private String name;

    float hp;

    float armor;

    int moveSpeed;

    class BattleScore {
        int kill;
        int die;
        int assit;

        public void legendary() {
            if (kill >= 8)
                System.out.println(name + "超神！");
            else
                System.out.println(name + "尚未超神！");
        }
    }

    public static void main(String[] args) {
        java59 garen = new java59();
        garen.name = "盖伦";

        BattleScore score = garen.new BattleScore();
        score.kill = 9;
        score.legendary();
    }

}