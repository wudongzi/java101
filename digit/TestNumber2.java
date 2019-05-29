package digit;

public class TestNumber2 {

    public static void main(String[] args) {
        int i = 5;

        String str = String.valueOf(i);

        Integer it = i;
        String str2 = it.toString();
        String str1 = "999";
        int j= Integer.parseInt(str1);
        System.out.println(j);
        float f = 3.14f;
        String s = String.valueOf(f);
        f= Float.parseFloat(s);
        Float.parseFloat("3.1a4");

    }
}