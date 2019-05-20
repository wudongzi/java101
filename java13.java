import java.util.Scanner;
public class java13 {
    public static void main(String[] args){
        int a = 5;
        int b = 6;
        int c = 5;

        System.out.println(a>b);
        System.out.println(a>=c);
        System.out.println(a == b);
        System.out.println(a!=b);

        Scanner s = new Scanner(System.in );
        int d = s.nextInt();
        System.out.println("第一个整数："+d);
        int e = s.nextInt();
        System.out.println("第二个整数："+e);
        System.out.println(d > e);
        System.out.println(d >= e);
        System.out.println(d == e);
        System.out.println(d = e);
        System.out.println(d != e);



    }
}
