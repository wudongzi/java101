public class java22 {
    public static void main(String[] args){
        int i = 0;
        while(i<5){
            System.out.println(i);
            i++;
        }

        for(int j = 0;j < 5;j++){
            System.out.println(j);
        }

        int b = 1;
        int c = 2;
        for(int a = 1;a < 11;a++){
            System.out.println(b);
            b = b*c;
        }

        int money = 1;
        int day = 10;
        int sum = 0;
        for(int q = 1; q<=day;q++){
            sum += money;
            System.out.println(sum);
            money *= 2;
        }
    }
}
