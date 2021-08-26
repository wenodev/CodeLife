package ch15;

public class StringRegionMatches {
    public static void main(String[] args) {
        StringRegionMatches stringRegionMatches = new StringRegionMatches();
        String text = "This is a text";
        String compare1 = "is";
        String compare2 = "this";

        System.out.println(text.regionMatches(2, compare1, 0, 1)); // true
        System.out.println(text.regionMatches(5, compare1, 0, 2)); // true
        System.out.println(text.regionMatches(true, 0,compare2, 0, 4)); // true
    }
}
