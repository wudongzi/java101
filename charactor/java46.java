package charactor;

public class java46 {
    private java46(){
    }
    private static java46 instance = new java46();
    public static java46 getInstance(){
        if(null==instance){
            instance = new java46();
        }
        return instance;
    }
    public static void main(String[] args) {
        java46 g = new java46();
        java46 g1 = java46.getInstance();
        java46 g2 = java46.getInstance();
        java46 g3 = java46.getInstance();
        System.out.println(g1==g2);
        System.out.println(g1==g3);
    }

}