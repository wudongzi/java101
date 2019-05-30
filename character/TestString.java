package character;

public class TestString {

    public static void main(String[] args) {
        String garen ="盖伦";

        String teemo = new String("提莫");

        char[] cs = new char[]{'崔','斯','特'};

        String hero = new String(cs);

        String hero3 = garen + teemo;
        int kill = 8;
        String title="超神";
        String sentence = garen+ " 在进行了连续 " + kill + " 次击杀后，获得了 " + title +" 的称号";
        System.out.println(sentence);
        String sentenceFormat ="%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";
        String sentence2 = String.format(sentenceFormat, garen,kill,title);
        System.out.println(sentence2);
        System.out.println(garen.length());

    }
}