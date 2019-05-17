public class java10 {
    public void main() {
        final int i = 1;
        //int i = 5 就不行了，因为final只能赋值一次
    }
    public void main1(){
        final int i;
        i = 5;
        //i = 10;
    }
    public void main2(final int i){
         //i = 10;并不能
    }
}
