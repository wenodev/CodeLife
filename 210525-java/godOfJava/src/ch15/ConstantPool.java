package ch15;

public class ConstantPool {
    public static void main(String[] args) {
        ConstantPool constantPool = new ConstantPool();
        constantPool.checkCompare();
    }

    private void checkCompare() {
        String text1 = "Check value";
        String text2 = "Check value";
        if (text1 == text2){
            System.out.println("hello");
        }
    }
}
