import java.util.Scanner;
public class java11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("第一个整数："+a);
        int b = s.nextInt();
        System.out.println("第二个整数："+b);

        Scanner e = new Scanner(System.in);
        float d = s.nextFloat();
        System.out.println("读取的浮点数的值是："+d);

        Scanner r = new Scanner(System.in);
        String f = s.nextLine();
        System.out.println("读取的字符串是："+f);

        Scanner t = new Scanner(System.in);
        int i = t.nextInt();
        System.out.println("读取的整数是"+ i);
        String rn = t.nextLine();
        String g = t.nextLine();
        System.out.println("读取的字符串是："+g);
    }
}
