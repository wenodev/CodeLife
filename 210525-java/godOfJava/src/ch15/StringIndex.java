package ch15;

public class StringIndex {
    public static void main(String[] args) {
        StringIndex stringIndex = new StringIndex();
        stringIndex.indexOf("Java is both a programming language and a platform");
        stringIndex.lastIndexOf("Java is both a programming language and a platform");
    }

    private void indexOf(String str) {
        System.out.println("indexOf");
        System.out.println(str.indexOf("both")); // 8
        System.out.println(str.indexOf("both", 10)); // -1
    }

    private void lastIndexOf(String str) {
        System.out.println("lastIndexOf");
        System.out.println(str.lastIndexOf("both")); // 8
        System.out.println(str.lastIndexOf("both", 7)); // -1
    }

}
