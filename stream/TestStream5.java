package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestStream5 {

    public static void main(String[] args) {
        File f = new File("d:/lol.txt");

        try (FileInputStream fis = new FileInputStream(f)) {
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b : all) {
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
