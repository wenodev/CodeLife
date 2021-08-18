package ch13;

public enum OverTimeValues {
    ONE(1),
    TWO(2),
    THREE(3);
    private final int amount;

    OverTimeValues(int amount){
        this.amount = amount;
    }
    public int getAmount(){
        return this.amount;
    }

}
