package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class TestStream10 {

    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
        File f = new File("E:\\project\\j2se\\src\\test.txt");
        System.out.println("默认编码方式:"+Charset.defaultCharset());

        try (FileReader fr = new FileReader(f)) {
            char[] cs = new char[(int) f.length()];
            fr.read(cs);
            System.out.printf("FileReader会使用默认的编码方式%s,识别出来的字符是：%n",Charset.defaultCharset());
            System.out.println(new String(cs));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8"))) {
            char[] cs = new char[(int) f.length()];
            isr.read(cs);
            System.out.printf("InputStreamReader 指定编码方式UTF-8,识别出来的字符是：%n");
            System.out.println(new String(cs));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}