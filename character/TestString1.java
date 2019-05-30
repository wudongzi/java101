package character;

public class TestString1 {

    public static void main(String[] args) {

        char cs[] = new char[5];
        short start = '0';
        short end = 'z'+1;
        for (int i = 0; i < cs.length; i++) {
            while (true) {
                char c = (char) ((Math.random() * (end - start)) + start);
                if (Character.isLetter(c) || Character.isDigit(c)) {
                    cs[i] = c;
                    break;
                }
            }
        }
        String result = new String(cs);
        System.out.println(result);


        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool+=(char)i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool+=(char)i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool+=(char)i;
        }
        char cs2[] = new char[5];
        for (int i = 0; i < cs2.length; i++) {
            int index = (int) (Math.random()*pool.length());
            cs2[i] =  pool.charAt( index );
        }
        String result2 = new String(cs2);
        System.out.println(result2);

    }
}