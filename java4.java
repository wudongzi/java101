public class java4 {
    String name;//名字
    float hp;//血量
    float armor;//护甲
    int moveSpeed;//移动速度

    //坑队友
    void keng(){
        System.out.println("坑队友");
    }
    //获取护甲值
    float getArmor(){
        return armor;
    }

    //增加移动速度
    void addSpeed(int speed){
        //在原来的基础上增加移动速度
        moveSpeed = moveSpeed + speed;
    }

    //超神
    void legendary(){
        System.out.println("超神");
    }

    //获取当前血量
    float getHp(){
        return hp;
    }

    //回血
    void recovery(float blood){
        hp = hp + blood;
    }

    public static void main(String[] args){
        java4 garen = new java4();
        garen.name = "盖伦";
        garen.hp = 600;
        garen.armor = 100;
        garen.moveSpeed = 350;
        garen.addSpeed(100);
        garen.recovery(200);
    }
}
