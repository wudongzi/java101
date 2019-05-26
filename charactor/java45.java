package charactor;

public class java45 {
    public String name =java45.getName("属性声明") ;

    public java45(){
        name = java45.getName("构造方法");
    }
    {
        name = java45.getName("初始化块");
    }

    public static String getName(String pos){
        String result= "name "+pos;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        new java45();
    }

}
