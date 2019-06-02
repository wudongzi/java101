package character;

public class MyStringBuffer2 implements IStringBuffer {

    int capacity = 16;
    int length = 0;
    char[] value;

    public MyStringBuffer2() {
        value = new char[capacity];
    }


    public MyStringBuffer2(String str) {
        this();
        if (null == str)
            return;

        if (capacity < str.length()) {
            capacity = value.length * 2;
            value = new char[capacity];
        }

        if (capacity >= str.length())
            System.arraycopy(str.toCharArray(), 0, value, 0, str.length());

        length = str.length();

    }

    @Override
    public void reverse() {
        for (int i = 0; i < length / 2; i++) {
            char temp = value[i];
            value[i] = value[length - i - 1];
            value[length - i - 1] = temp;
        }
    }

    @Override
    public void append(String str) {


    }

    @Override
    public void append(char c) {


    }

    @Override
    public void insert(int pos, char b) {


    }

    @Override
    public void insert(int pos, String b) {


    }

    @Override
    public void delete(int start) {


    }

    @Override
    public void delete(int start, int end) {

    }

    @Override
    public int length() {

        return length;
    }

    public String toString() {
        char[] realValue = new char[length];

        System.arraycopy(value, 0, realValue, 0, length);

        return new String(realValue);
    }

    public static void main(String[] args) {
        //MyStringBuffer sb = new MyStringBuffer("there light");

        //sb.reverse();
        //System.out.println(sb);

    }

}