package stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestStream12 {

    public static void main(String[] args) {

        File f = new File("d:/lol.txt");

        try (
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
        )
        {
            while (true) {

                String line = br.readLine();
                if (null == line)
                    break;
                System.out.println(line);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}