package ch16.staticExample;

public class NestedSample {
    public static void main(String[] args) {
        OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();
        staticNested.setValue(3);
        System.out.println(staticNested.getValue());
    }
}
