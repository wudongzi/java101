package file;

import java.io.File;
import java.util.Date;

public class TestFile1 {

    public static void main(String[] args) {

        File f = new File("d:/LOLFolder/LOL.exe");
        System.out.println("当前文件是：" +f);

        System.out.println("判断是否存在："+f.exists());

        System.out.println("判断是否是文件夹："+f.isDirectory());

        System.out.println("判断是否是文件："+f.isFile());

        System.out.println("获取文件的长度："+f.length());

        long time = f.lastModified();
        Date d = new Date(time);
        System.out.println("获取文件的最后修改时间："+d);

        f.setLastModified(0);

        File f2 =new File("d:/LOLFolder/DOTA.exe");
        f.renameTo(f2);
        System.out.println("把LOL.exe改名成了DOTA.exe");

        System.out.println("注意： 需要在D:\\LOLFolder确实存在一个LOL.exe,\r\n才可以看到对应的文件长度、修改时间等信息");
    }
}