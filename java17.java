import java.util.Scanner;
public class java17 {
    public static  void main(String[] args){
        int i = 5;
        int j = 6;
        int k = i < j ? 80:90;
        System.out.println(k);

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        System.out.println(t<=5?"工作日":"周末");
    }
}
