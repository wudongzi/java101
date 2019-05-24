public class java30 {
    public static void main(String[] args) {
        int a [] = new int[]{18,62,68,82,65,9};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        for (int i = 1; i < a.length; i++) {
            if(a[i]<a[0]){
                int temp = a[0];
                a[0] = a[i];
                a[i] = temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");

        for (int i = 2; i < a.length; i++) {
            if(a[i]<a[1]){
                int temp = a[1];
                a[1] = a[i];
                a[i] = temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        for (int j = 0; j < a.length-1; j++) {
            for (int i = j+1; i < a.length; i++) {
                if(a[i]<a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");

        int b [] = new int[]{18,62,68,82,65,9};
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < b.length-1; i++) {
            if(b[i]>b[i+1]){
                int temp = b[i];
                b[i] = b[i+1];
                b[i+1] = temp;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < b.length-2; i++) {
            if(b[i]>b[i+1]){
                int temp = b[i];
                b[i] = b[i+1];
                b[i+1] = temp;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println(" ");
        for (int j = 0; j < b.length; j++) {
            for (int i = 0; i < b.length-j-1; i++) {
                if(b[i]>b[i+1]){
                    int temp = b[i];
                    b[i] = b[i+1];
                    b[i+1] = temp;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println(" ");
    }
}


