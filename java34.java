import java.util.Arrays;

public class java34 {
    public static void main(String[] args) {
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        int[] b = Arrays.copyOfRange(a, 0, 3);

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        String content = Arrays.toString(a);
        System.out.println(content);
        System.out.println("排序之前 :");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序之后:");
        System.out.println(Arrays.toString(a));
        System.out.println("数字62会出现的位置:"+Arrays.binarySearch(a, 62));
        int c[] = new int[] { 18, 62, 68, 82, 65, 8 };
        System.out.println(Arrays.equals(a, c));

        int d[] = new int[10];
        Arrays.fill(d, 5);
        System.out.println(Arrays.toString(d));

    }
}
