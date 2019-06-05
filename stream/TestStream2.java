package stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream2 {

    public static void main(String[] args) {
        try {

            File f = new File("d:/lol2.txt");

            byte data[] = { 88, 89 };

            FileOutputStream fos = new FileOutputStream(f);

            fos.write(data);

            fos.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}