package file;

import java.io.File;
import java.io.IOException;

public class TestFile2 {

    public static void main(String[] args) throws IOException {

        File f = new File("d:/LOLFolder/skin/garen.ski");

        f.list();

        File[]fs= f.listFiles();

        f.getParent();

        f.getParentFile();

        f.mkdir();

        f.mkdirs();

        f.createNewFile();

        f.getParentFile().mkdirs();

        f.listRoots();

        f.delete();

        f.deleteOnExit();

    }
}