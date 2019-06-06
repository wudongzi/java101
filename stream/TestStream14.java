package stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class TestStream14 {
    public static void main(String[] args) {

        File f =new File("d:/lol2.txt");

        try(FileWriter fr = new FileWriter(f);PrintWriter pw = new PrintWriter(fr);) {
            pw.println("garen kill teemo");

            pw.flush();
            pw.println("teemo revive after 1 minutes");
            pw.flush();
            pw.println("teemo try to garen, but killed again");
            pw.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}