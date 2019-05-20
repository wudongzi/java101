public class java14 {
    public static void main(String[] args){
        int i = 2;
        System.out.println(i==1 & i++ == 2);
        System.out.println(i);
        int j = 3;
        System.out.println(j==1 && ++j ==2);
        System.out.println(j);

        int a = 2;
        System.out.println( a== 1 | a++ ==2  );
        System.out.println(a);
        int b = 2;
        System.out.println( b== 2 || b++ ==2  );
        System.out.println(b);

        boolean c = true;
        System.out.println(c);
        System.out.println(!c);

        boolean d = false;
        System.out.println(c^d);
        System.out.println(c^!d);

    }
}
