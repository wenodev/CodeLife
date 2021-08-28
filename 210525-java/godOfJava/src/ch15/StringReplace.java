package ch15;

public class StringReplace {
    public static void main(String[] args) {
        String text = "The String class represents character strings";
        System.out.println(text.replace('s', 'z'));
        System.out.println(text);
        System.out.println(text.replace("tring", "trike"));
        System.out.println(text.replaceAll(" ", "|"));
        System.out.println(text.replace(" ", "|"));
        System.out.println(text.replaceFirst(" ", "|"));
    }
}
