package ch14;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.printDivide(1,2);
        calculator.printDivide(1,0);
    }

    private void printDivide(double d1, double d2) {
        if (d2 == 0){
            throw new NumberCanNotBeZeroException("Second value can't be Zero");
        }
        double result = d1/d2;
        System.out.println(result);
    }
}
