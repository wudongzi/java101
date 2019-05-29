public class java68 extends java64 implements java66{

    private String name;
    protected java68() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    public void walk(){
        System.out.println("swimming");
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        this.name = name;

    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("playing");
    }

}