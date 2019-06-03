package date;

import java.util.Date;

public class TestDate3 {

    public static void main(String[] args) {
        long second = 1000;
        long minute = 60*second;
        long hour = minute * 60;
        long day = hour*24;
        long year = day * 365;
        long year1995Start  = (1995-1970) * year;
        long leapDay = (1995-1970)/4*day;
        year1995Start+=leapDay;
        long eightHour = hour*8;
        year1995Start-=eightHour;

        Date dStart = new Date(year1995Start);
        System.out.println("1995年第一天："+dStart);
        long year1995End = year1995Start + year - 1;
        Date dEnd = new Date(year1995End);
        System.out.println("1995年最后一天："+dEnd);

        long randomTime = (long) (Math.random()*(year-1) + year1995Start);
        Date dRandom = new Date(randomTime);
        System.out.println("1995年这一年中的一个随机时间:" + dRandom);

    }
}