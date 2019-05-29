package digit;

public class TestNumber1 {

    public static void main(String[] args) {

        byte b = 1;
        short s = 2;
        float f = 3.14f;
        double d = 6.18;

        Byte b1 = b;
        Short s1 = s;
        Float f1 = f;
        Double d1 = d;

        b = b1;
        s = s1;
        f = f1;
        d = d1;

        System.out.println(Byte.MAX_VALUE);

    }
}

