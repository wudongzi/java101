package charactor;

public class java60 {
    public String name;
    protected float hp;

    private static void battleWin(){
        System.out.println("battle win");
    }

    static class EnemyCrystal{
        int hp=5000;

        public void checkIfVictory(){
            if(hp==0){
                java60.battleWin();


                //System.out.println(name + " win this game");
            }
        }
    }

    public static void main(String[] args) {
        java60.EnemyCrystal crystal = new java60.EnemyCrystal();
        crystal.checkIfVictory();
    }

}
