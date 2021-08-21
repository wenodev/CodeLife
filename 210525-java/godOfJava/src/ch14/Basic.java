package ch14;

public class Basic {
    public static void main(String[] args)  {
        Basic sample = new Basic();
        sample.throwMyException(13);
    }
    private void throwMyException(int number) {
        int[] intArray = new int[5];

        try {
            System.out.println(intArray[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array exception");
        }
        catch (Exception e){
            System.out.println("exception");
        }

    }
}
