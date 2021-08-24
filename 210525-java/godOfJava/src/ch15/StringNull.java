package ch15;

public class StringNull {
    public static void main(String[] args) {
        StringNull sample = new StringNull();
//        sample.nullCheck(null);
        sample.nullCheck2(null);
    }

    private boolean nullCheck(String text) {
        int textLength = text.length(); // exception 발생
        System.out.println(textLength);

        if (text == null) return true;
        else return false;
    }

    private boolean nullCheck2(String text) {
        if (text == null) {
            return true;
        }
        int textLength = text.length(); // exception 발생
        System.out.println(textLength);
        return false;
    }
}
