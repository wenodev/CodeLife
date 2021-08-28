package ch15;

import java.nio.charset.StandardCharsets;

public class StringChar {
    public static void main(String[] args) {
        String text= "Java technology";
        String technology = text.substring(5,9);
        System.out.println(text);
        System.out.println(technology);
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
    }
}
