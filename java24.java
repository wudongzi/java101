
public class java24 {
    public static void main(String[] args) {
        for(int i = 1;i<10;i++){
            if(0 == i%2)
                break;
            System.out.println(i);
        }
        int fundPerMonth = 1000;
        int fundPerYear = fundPerMonth *12;
        float rate = 0.20f;
        //F = p* ( (1+r)^n );
        int sum = 0;
        int target = 1000*1000;
        for (int j = 1; j < 100; j++) {
            int year = j;
            float compoundInterestRate = 1;
            for (int i = 0; i < year; i++) {
                compoundInterestRate = compoundInterestRate * (1+rate);
            }
            int compoundInterest = (int) (fundPerYear * compoundInterestRate);

            sum +=compoundInterest;
            System.out.println("经过" + year + " 年， 总收入 " + sum);
            if(sum>=target){
                System.out.println("一共要" + year + "年，加起来收入是" + target );
                break;
            }
        }

    }
}