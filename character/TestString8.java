package character;

public class TestString8 {

    public static void main(String[] args) {

        String sentence = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";

        System.out.println(sentence.indexOf('8'));

        System.out.println(sentence.indexOf("超神"));

        System.out.println(sentence.lastIndexOf("了"));

        System.out.println(sentence.indexOf(',',5));

        System.out.println(sentence.contains("击杀"));

    }
}