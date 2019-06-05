package exception;

import java.io.File;
import java.io.FileInputStream;

public class TestException10 {

    public static void main(String[] args) {

        File f = new File("d:/LOL.exe");

        try {
            new FileInputStream(f);

        } catch (Throwable t) {
            // TODO Auto-generated catch block
            t.printStackTrace();
        }

    }
}