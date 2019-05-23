public class java23 {
    public static void main(String[] args){
        //continue
        //如果是双数，后面的代码不执行，直接进入下一个循环

        for(int i = 0;i<10;i++){
            if(0 == i%2)
                continue;
            System.out.println(i);
        }

        for(int j = 0;j<100;j++){
            if(0==j%3 | 0==j%5)
                continue;
            System.out.println(j);
        }
    }
}
