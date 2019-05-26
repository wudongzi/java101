public class java39 {

    String name;

    float hp;

    float armor;

    int moveSpeed;

    public void showAddressInMemory(){
        System.out.println("打印this看到的虚拟地址："+this);
    }

    public static void main(String[] args) {
        //java39 garen =  new java39();
        //garen.name = "盖伦";

        //System.out.println("打印对象看到的虚拟地址："+garen);
        //garen.showAddressInMemory();

       //java39 teemo =  new java39();
        //teemo.name = "提莫";
        //System.out.println("打印对象看到的虚拟地址："+teemo);
        //teemo.showAddressInMemory();
    }
    public void setName1(String name){
        name = name;
    }
    public void setName2(String heroName){
        name = heroName;
    }
    public void setName3(String name){
        this.name = name;
    }
    public java39(String name,float hp){
        this.name = name;
        System.out.println("两个参数的构造方法");
        this.hp = hp;
    }
    public java39(String name, float hp, float armor, int moveSpeed) {
        this(name,hp);
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }


}