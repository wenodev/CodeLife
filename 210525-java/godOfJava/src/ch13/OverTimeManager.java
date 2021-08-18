package ch13;

public class OverTimeManager {
    public static void main(String[] args) {
        System.out.println(OverTimeValues.ONE.compareTo(OverTimeValues.THREE));
        System.out.println(OverTimeValues.ONE.compareTo(OverTimeValues.TWO));
        System.out.println(OverTimeValues.THREE.compareTo(OverTimeValues.TWO));
    }
}
