public abstract class java64 {

    protected int legs;
    protected java64(int legs){
        this.legs = legs;
    }
    public abstract void eat();
    public void walk(){
        System.out.println("用 " + legs +  " 条腿走路");
    }
}