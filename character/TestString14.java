package character;

public class TestString14 {

    public static void main(String[] args) {
        int total = 5000000;
        String s = randomString(10);
        MyStringBuffer msb = new MyStringBuffer();
        StringBuffer sb = new StringBuffer();

        long start = System.currentTimeMillis();
        for (int i = 0; i <total; i++) {
            sb.append(s);
        }
        long end = System.currentTimeMillis();
        System.out.printf("使用StringBuffer的方式，连接%d次，耗时%d毫秒%n",total,end-start);
        start = System.currentTimeMillis();
        for (int i = 0; i <total; i++) {
            msb.append(s);
        }
        end = System.currentTimeMillis();
        System.out.printf("使用MyStringBuffer的方式，连接%d次，耗时%d毫秒%n",total,end-start);

    }

    private static String randomString(int length) {
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
        char cs[] = new char[length];
        for (int i = 0; i < cs.length; i++) {
            int index = (int) (Math.random() * pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;
    }

}