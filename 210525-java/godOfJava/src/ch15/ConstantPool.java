package ch15;

public class ConstantPool {
    public static void main(String[] args) {
        ConstantPool constantPool = new ConstantPool();
        constantPool.checkCompare();
        constantPool.checkCompareTo();
    }

    private void checkCompareTo() {
        String text = "a";
        String text2 = "b";
        String text3 = "c";
        System.out.println(text2.compareTo(text));
        System.out.println(text2.compareTo(text3));
        System.out.println(text.compareTo(text3));
    }

    private void checkCompare() {
        String text1 = "Check value";
        String text2 = "Check value";
        if (text1 == text2){
            System.out.println("hello");
        }
    }
}
