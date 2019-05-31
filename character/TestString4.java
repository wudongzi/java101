package character;

public class TestString4 {

    public static void main(String[] args) {

        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";

        String subSentences[] = sentence.split(",");
        for (String sub : subSentences) {
            System.out.println(sub);
        }

    }
}