public class java33 {
    public static void main(String[] args) {
        //int[][] a = new int[2][3];
        //int[][] b = new int[2][];
        //b[0]  =new int[3];
        //b[0][2] = 5;
        //int[][] c = new int[][]{
        //        {1,2,4},
        //        {4,5},
        //        {6,7,8,9}
        //};
        int a[][] = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int[] row : a) {
            for (int each : row) {
                System.out.print(each + "\t");
            }
            System.out.println();
        }
        int max = -1;
        int target_i = -1;
        int target_j = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    target_i = i;
                    target_j = j;
                }
            }
        }
        System.out.println("找出来最大的是:" + max);
        System.out.println("其坐标是[" + target_i + "][" + target_j + "]");
    }
}