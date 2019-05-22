import java.util.Scanner;
public class java19 {
    public static void main(String[] args){
        int day = 5;
        if(day == 1)
            System.out.println("星期一");
        else if(day == 2)
            System.out.println("星期二");
        else if(day == 3)
            System.out.println("星期三");
        else if(day == 4)
            System.out.println("星期四");
        else if(day == 5)
            System.out.println("星期五");
        else if(day == 6)
            System.out.println("星期六");
        else if(day == 7)
            System.out.println("星期天");
        else
            System.out.println("这是啥");

        switch(day){
            case 1:System.out.println("星期一");
            break;
            case 2:System.out.println("星期二");
            break;
            case 3:System.out.println("星期三");
            break;
            case 4:System.out.println("星期四");
            break;
            case 5:System.out.println("星期五");
            break;
            case 6:System.out.println("星期六");
            break;
            case 7:System.out.println("星期天");
            break;
        }
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int i = s.nextInt();
        switch(i){
            case 1:
            case 2:
            case 3:
                System.out.println("春天");
            break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏天");
            break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋天");
            break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬天");
            break;
        }

        if(i == 1|i == 2|i == 3)
            System.out.println("春天");
        else if(i == 4|i == 5|i == 6)
            System.out.println("夏天");
        else if(i == 7|i == 8|i == 9)
            System.out.println("秋天");
        else if(i == 10|i == 11|i == 12)
            System.out.println("冬天");
    }
}
