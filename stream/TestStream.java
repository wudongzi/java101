package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestStream {

    public static void main(String[] args) {
        try {
            File f = new File("d:/lol.txt");

            FileInputStream fis = new FileInputStream(f);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}