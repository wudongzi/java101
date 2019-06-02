package character;

public class MyStringBuffer1 implements IStringBuffer{

    int capacity = 16;
    int length = 0;
    char[] value;
    public MyStringBuffer1(){
        value = new char[capacity];
    }


    public MyStringBuffer1(String str){
        if(null!=str)
            value =str.toCharArray();

        length = value.length;

        if(capacity<value.length)
            capacity  = value.length*2;
    }

    @Override
    public void append(String str) {
        // TODO Auto-generated method stub

    }

    @Override
    public void append(char c) {
        // TODO Auto-generated method stub

    }

    @Override
    public void insert(int pos, char b) {

    }

    @Override
    public void delete(int start) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(int start, int end) {
        // TODO Auto-generated method stub

    }

    @Override
    public void reverse() {
        // TODO Auto-generated method stub

    }

    @Override
    public int length() {
        // TODO Auto-generated method stub
        return length;
    }

    @Override
    public void insert(int pos, String b) {

    }

}