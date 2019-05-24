public class java29 {
    public static void main(String[] args){
        int[] a = new int[5];
        System.out.println(a[0]);
        a[0] = 100;
        a[1] = 101;
        a[2] = 103;
        a[3] = 120;
        a[4] = 140;

        int[] b = new int[]{101,102,103,132,1404};
        int[] c = {201,321,435,683,2131};

        int[] d = new int[5];
        d[0] = (int) (Math.random() * 100);
        d[1] = (int) (Math.random() * 100);
        d[2] = (int) (Math.random() * 100);
        d[3] = (int) (Math.random() * 100);
        d[4] = (int) (Math.random() * 100);
        System.out.println("数组中各个值是:");
        for (int i = 0; i < d.length; i++)
        System.out.print(d[i] + " ");

        for (int i = 0; i < d.length/2; i++) {
            int middle = d[d.length-i-1];
           d[d.length-i-1] = d[i];
            d[i] = middle;
                }
                System.out.println("再次反转后的数组中各个值是:");
                for (int i = 0; i < d.length; i++) {
                    System.out.print(d[i] + " ");
                }
                System.out.println();
    }
}
