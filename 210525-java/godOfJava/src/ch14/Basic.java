package ch14;

public class Basic {
    public static void main(String[] args)  {
        Basic sample = new Basic();
        sample.throwMyException(13);
    }
    private void throwMyException(int number)  {
        if (number > 12){
            throw new MyException("error");
        }
    }
}
