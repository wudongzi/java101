import java.util.Scanner;
public class java18 {
    public static void main(String[] args){
        boolean i = false;

        if (i)
            System.out.println("yes");
        else
            System.out.println("no");

        int j = 2;
        if (j == 1)
            System.out.println(1);
        else if (j == 2)
            System.out.println(2);
        else if (j == 3)
            System.out.println(3);
        else if (j == 4)
            System.out.println(4);

        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int q = s.nextInt();
        if(q%4 == 0 && q%100 != 0 | q%400 == 0)
            System.out.println("这是闰年");
        else
            System.out.println("这不是闰年");

        }
    }

