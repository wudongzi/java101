package date;


import java.util.Date;

public class TestDate1 {

    public static void main(String[] args) {

        Date now= new Date();

        System.out.println("当前时间:"+now.toString());

        System.out.println("当前时间getTime()返回的值是："+now.getTime());

        Date zero = new Date(0);
        System.out.println("用0作为构造方法，得到的日期是:"+zero);

    }
}