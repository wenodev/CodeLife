package ch15.homework;

public class UseStringMethods {
    public static void main(String[] args) {
        String str = "The String class represents character strings";
        String findStr = "string";
        UseStringMethods useStringMethods = new UseStringMethods();
        useStringMethods.printWords(str);
        useStringMethods.findString(str, findStr);
        useStringMethods.findAnyCaseString(str, findStr);
        useStringMethods.countChar(str, 's');
        useStringMethods.printContainWords(str, "ss");
    }

    public void printContainWords(String str, String ss) {
        for (String s : str.split(" ")){
            if (s.contains(ss)){
                System.out.println(s + " contains " + ss);
            }
        }
    }

    public void countChar(String str, char c) {
        int count = 0;
        for (char ch : str.toCharArray()){
            if (ch == c){
                count++;
            }
        }
        System.out.println("char 's' count is " + count);
    }

    public void findAnyCaseString(String str, String findStr) {
        System.out.println("String is appeared at " + str.toLowerCase().indexOf(findStr));
    }

    public void findString(String str, String findStr) {
        System.out.println("String is appeared at " + str.indexOf(findStr));
    }

    public void printWords(String str){
        for (String s : str.split(" ")){
            System.out.println(s);
        }
    }
}
