import java.util.Scanner;
public class java12 {
    public static void main(String[] args){
        int i = 10;
        int j = 10;
        int a = i+j;
        int b = i-j;
        int c = i*j;
        int d = i/j;
        System.out.println(a);
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        int z = s.nextInt();
        int e = q+z;
        System.out.println(e);
        int r = 10;
        long x = 20;
        int f = (int)(r+x);
        long v = r+x;
        int t = i%j;
        System.out.println(t);
        i++;
        System.out.println(i);

        float y = s.nextFloat();
        float h = s.nextFloat();
        float n = y/(h*h);
        System.out.println("你的BMI是："+n);


    }
}
