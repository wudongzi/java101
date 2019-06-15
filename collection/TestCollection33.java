package collection;

import java.util.HashMap;
import java.util.Hashtable;

public class TestCollection33 {
    public static void main(String[] args) {


        HashMap<String,String> hashMap = new HashMap<String,String>();

        hashMap.put(null, "123");
        hashMap.put("123", null);

        Hashtable<String,String> hashtable = new Hashtable<String,String>();

        hashtable.put(null, "123");
        hashtable.put("123", null);

    }
}