public class java15 {
    public static void main(String[] args){
        int a = 5;
        String b = (Integer.toBinaryString(a));
        System.out.println(a+"的二进制是："+b);

        int i = 5;
        int j = 6;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(j));
        System.out.println(i|j);
        System.out.println(i&j);
        System.out.println(i^j);
        System.out.println(i^0);
        System.out.println(i^i);
        System.out.println(~i);
        System.out.println(i<<1);
        System.out.println(i>>1);

        int l = i>>1;
        System.out.println(Integer.toBinaryString(l));
        System.out.println(l);
        int k = i>>>1;
        System.out.println(Integer.toBinaryString(k));
        System.out.println(k);


    }
}
