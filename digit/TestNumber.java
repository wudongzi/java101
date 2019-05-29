package digit;

public class TestNumber {

    public static void main(String[] args) {
        int i = 5;
        Integer it = new Integer(i);
        int i2 = it.intValue();
        System.out.println(it instanceof Number);
        Integer it2 = i;
        int i3 = it;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}