package stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestStream6 {

    public static void main(String[] args) {

        File f = new File("d:/lol.txt");

        try (FileReader fr = new FileReader(f)) {

            char[] all = new char[(int) f.length()];

            fr.read(all);
            for (char b : all) {

                System.out.println(b);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}