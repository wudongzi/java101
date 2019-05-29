public class java67 extends java64 implements java66{

    private String name;

    public java67(String name){
        super(4);
        this.name = name;
    }

    public java67(){
        this("");
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {

        return name;
    }

    public void play() {
        System.out.println("Cat is playing");
    }

    public void eat() {
        System.out.println("eating");

    }

}