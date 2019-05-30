package digit;

public class TestNumber5 {

    public static void main(String[] args) {

        String name ="盖伦";
        int kill = 8;
        String title="超神";


        String sentence = name+ " 在进行了连续 " + kill + " 次击杀后，获得了 " + title +" 的称号";

        System.out.println(sentence);

        String sentenceFormat ="%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";
        System.out.printf(sentenceFormat,name,kill,title);

    }
}