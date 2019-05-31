package character;

public class TestString9 {

    public static void main(String[] args) {

        String s = "peter piper picked a peck of pickled peppers";
        System.out.println(s);
        String[] words = s.split(" ");
        int count= 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char firstWord =word.charAt(0);
            if(firstWord=='p')
                count++;

        }
        System.out.printf("总共有%d个p开头的单词",count);

    }
}