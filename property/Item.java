package property;

public class Item {
    String name;
    int price;

    public Item(){

    }

    public Item(String name){
        this.name = name;
    }

    public void effect(){
        System.out.println("物品使用后，可以有效果");
    }

}