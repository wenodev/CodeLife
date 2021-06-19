package ch6;

public class InterestManager {
    public static void main(String[] args) {
        InterestManager interestManager = new InterestManager();

        //문제 6
        for (int i=1; i<=365; i++){
            System.out.println("day" + i + " : " + interestManager.calculateAmount(i, 100));
        }

        //문제 7
        for (int i=10; i<=365; i+= 10){
            System.out.println("day" + i + " : " + interestManager.calculateAmount(i, 100));
        }

    }

    /**
     * 이율을 리턴하는 메소드 입니다.
     * @param day 날짜
     * @return 날짜에 따른 이율을 리턴합니다.
     */
    public double getInterestRate(int day) {
        if (day <= 0){
            throw new RuntimeException("please input correct day");
        }
        else if (day <= 90){
            return 0.5d;
        }
        else if (day <= 180){
            return 1.0d;
        }
        else if (day <= 364){
            return 2.0d;
        }
        else{
            return 5.6d;
        }
    }

    /**
     * 이자율과 예치금을 계산한 금액을 리턴합니다.
     * @param day 날짜
     * @param amount 예치금
     * @return 계산된 금액과 예치금을 더한 값을 리턴합니다.
     */
    public double calculateAmount(int day, long amount){
        double interestAmount = (getInterestRate(day) * amount) / 100.0;
        return interestAmount + amount;
    }

}
