package ch8;

import java.nio.charset.StandardCharsets;

public class StringTest {

    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        String str = "a";
        System.out.println(System.identityHashCode(str));
        stringTest.change(str);
        System.out.println(System.identityHashCode(str));
    }

    public void change(String str){
        System.out.println(System.identityHashCode(str));
        str = "b";
        System.out.println(System.identityHashCode(str));

    }

}
