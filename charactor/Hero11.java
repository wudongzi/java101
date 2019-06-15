package charactor;

public class Hero11  {
    public String name;
    public float hp;

    public int damage;

    public Hero11() {

    }

    public Hero11(String name) {

        this.name = name;
    }

    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }

    public Hero11(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

}