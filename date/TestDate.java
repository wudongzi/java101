package date;


import java.util.Date;

public class TestDate {

    public static void main(String[] args) {


        Date d1 = new Date();
        System.out.println("当前时间:");
        System.out.println(d1);
        System.out.println();

        Date d2 = new Date(5000);
        System.out.println("从1970年1月1日 早上8点0分0秒 开始经历了5秒的时间");
        System.out.println(d2);

    }
}