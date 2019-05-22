import java.util.Scanner;
public class java20 {
    public static void main(String[] args){
        int i = 0;
        while(i<5){
            System.out.println(i);
            i++;
        }
        do{
            System.out.println(i);
            i++;
        }while(i<5);

        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个数");
        int j = s.nextInt();
        int k = 1;
            while(j>1){
            k = j*k;
            j--;
        }
        System.out.println(k);



        }

    }

