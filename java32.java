public class java32 {
    public static void main(String[] args) {
        int a [] = new int[]{18,62,68,82,65,9};
        int b[] = new int[3];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        int c[] = new int[(int) (Math.random() * 5)+5];
        for (int i = 0; i < c.length; i++)
            c[i] = (int) (Math.random() * 100);
        int d[] = new int[(int) (Math.random() * 5)+5];
        for (int i = 0; i < d.length; i++)
            d[i] = (int) (Math.random() * 100);

        System.out.println("数组c的内容:");
        for (int i : c) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("数组b的内容:");
        for (int i : d) {
            System.out.print(i+" ");
        }
        System.out.println();

        int e[] = new int[c.length+d.length];
        System.arraycopy(c, 0, e, 0, c.length);
        System.arraycopy(d, 0, e, a.length, d.length);

        System.out.println("数组e的内容:");
        for (int i : e) {
            System.out.print(i + " ");
        }
    }
}