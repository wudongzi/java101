public class java38 {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public java38() {
        System.out.println("实例化一个对象的时候，必然调用构造方法");
        java38 garen =  new java38("盖伦");
        java38 teemo =  new java38("提莫",383);
    }
    public static void main(String[] args){
        java38 h = new java38();
    }

    public java38(String javaname){
        name = javaname;
    }
    public java38(String heroname,float herohp){
        name = heroname;
        hp = herohp;
    }

    }
