public class java7 {
    public static void main(String[] args){
        char c = 'A';
        short s = 30;
        c = (char)s;

        long l = 60;
        int i = 70;
        l = i;
        System.out.println(l);

        byte b = 5;
        int i1 = 10;
        int i2 = 300;
        b = (byte)i1;
        System.out.println(b);

        b = (byte)i2;
        System.out.println(b);

    }
}
