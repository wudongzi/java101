package charactor;
import charactor.java52;
public class java53 {
    public String name;
    protected float hp;
    public void usejava52(java52 lp){
        lp.effect();
    }

    public static void main(String[] args) {

        int i = 5;
        int j = 6;
        int k = i+j;
        System.out.println(k);

        int a = 5;
        String b = "5";

        String c = a+b;
        System.out.println(c);

        java53 garen =  new java53();
        garen.name = "盖伦";
        java52 lp =new java52();
        garen.usejava52(lp);

    }

}