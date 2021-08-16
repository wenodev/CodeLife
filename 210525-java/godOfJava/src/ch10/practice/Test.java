package ch10.practice;

public class Test {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();
        Parent parent3 = new ChildOther();

        parent1.print(); // I'm parent
        parent2.print(); // I'm child
        parent3.print(); // I'm child other
    }
}
