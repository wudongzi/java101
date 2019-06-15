package charactor;

public class Hero12 {
    public String name;
    public float hp;

    public int damage;

    public Hero12(){

    }

    public Hero12(String name) {
        this.name =name;

    }

    public Hero12(String name,float hp, int damage) {
        this.name =name;
        this.hp = hp;
        this.damage = damage;
    }

    public int compareTo(Hero12 anotherHero) {
        if(damage<anotherHero.damage)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }

}