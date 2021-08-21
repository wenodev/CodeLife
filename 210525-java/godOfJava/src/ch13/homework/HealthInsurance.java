package ch13.homework;

public enum HealthInsurance {
    LEVEL_ONE(1000, 1.0F),
    LEVEL_TWO(2000, 2.0F),
    LEVEL_THREE(3000, 3.0F),
    LEVEL_FOUR(4000, 4.0F),
    LEVEL_FIVE(5000, 5.0F),
    LEVEL_SIX(6000, 6.0F);

    final int maxSalary;
    final float ratio;

    HealthInsurance(int maxSalary, float ratio) {
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }

    public float getRatio() {
        return this.ratio;
    }

    public static HealthInsurance getHealthInsurance(int salary){
        if (salary >= 0 && salary <= 1000){ return HealthInsurance.LEVEL_ONE; }
        else if (salary <= 2000){ return HealthInsurance.LEVEL_TWO; }
        else if (salary <= 3000){ return HealthInsurance.LEVEL_THREE; }
        else if (salary <= 4000){ return HealthInsurance.LEVEL_FOUR; }
        else if (salary <= 5000){ return HealthInsurance.LEVEL_FIVE; }
        else{ return HealthInsurance.LEVEL_SIX; }
    }
}
