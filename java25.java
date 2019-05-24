public class java25 {
    public static void main(String[] args) {
        int range = 20;
        float breakPoint = 0.618f;

        float minDiff = 100;
        int ansFenzi = 0;
        int ansFenmu = 0;
        for (int fenzi = 1; fenzi <= range; fenzi++) {
            for (int fenmu = 1; fenmu <= range; fenmu++) {
                if (0 == fenzi % 2 & 0 == fenmu % 2)
                    continue;
                float value = (float) fenzi / fenmu;
                float diff = value - breakPoint;
                diff = diff < 0 ? 0 - diff : diff;
                if (diff < minDiff) {
                    minDiff = diff;
                    ansFenzi = fenzi;
                    ansFenmu = fenmu;
                }
            }
        }
        System.out.println("离黄金分割点(" + breakPoint + ")最近两个数相除是:" + ansFenzi + "/" + ansFenmu + "="
                + ((float) ansFenzi / ansFenmu));

    }
}
