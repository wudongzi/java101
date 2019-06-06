package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import charactor.Hero1;

public class TestStream16 {

    public static void main(String[] args) {

        Hero1 h = new Hero1();
        h.name = "garen";
        //h.hp = 616;


        File f =new File("d:/garen.lol");

        try(

                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos =new ObjectOutputStream(fos);

                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois =new ObjectInputStream(fis);
        ) {
            oos.writeObject(h);
            Hero1 h2 = (Hero1) ois.readObject();
            System.out.println(h2.name);
            //System.out.println(h2.hp);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}