package stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestStream7 {

    public static void main(String[] args) {

        File f = new File("d:/lol2.txt");

        try (FileWriter fr = new FileWriter(f)) {

            String data="abcdefg1234567890";
            char[] cs = data.toCharArray();
            fr.write(cs);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}