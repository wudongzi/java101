package charactor;

public class java43 {
    public String name;
    protected float hp;
    static String copyright;
    public static void main(String[] args) {
        java43 garen =  new java43();
        garen.name = "盖伦";

        java43.copyright = "版权由Riot Games公司所有";

        System.out.println(garen.name);
        System.out.println(garen.copyright);

        java43 teemo =  new java43();
        teemo.name = "提莫";
        System.out.println(teemo.name);
        System.out.println(teemo.copyright);

    }

}