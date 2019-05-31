package character;

public class TestString3 {

    public static void main(String[] args) {

        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";

        char c = sentence.charAt(0);

        System.out.println(c);
        char[] cs = sentence.toCharArray();
        System.out.println(sentence.length() == cs.length);
        String subString1 = sentence.substring(3);
        System.out.println(subString1);
        String subString2 = sentence.substring(3,5);
        System.out.println(subString2);

    }
}