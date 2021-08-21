package ch13;

public class OverTimeManager {
    public static void main(String[] args) {
//        System.out.println(OverTimeValues.ONE.compareTo(OverTimeValues.THREE));
//        System.out.println(OverTimeValues.ONE.compareTo(OverTimeValues.TWO));
//        System.out.println(OverTimeValues.THREE.compareTo(OverTimeValues.TWO));

//        OverTimeValues[] overTimeValues = OverTimeValues.values();
//        for (OverTimeValues overTimeValues1 : overTimeValues){
//            System.out.println(overTimeValues1.getAmount());
//        }
//        System.out.println(OverTimeValues.ONE.getDeclaringClass());
        System.out.println(OverTimeValues.ONE.valueOf(OverTimeValues.class, "ONE"));

    }
}
