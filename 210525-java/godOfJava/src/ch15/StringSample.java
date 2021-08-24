package ch15;

public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.convert();
    }

    private void convert() {
        try {
            String korean = "한글";
            byte[] array1 = korean.getBytes("UTF-16");
            printByteArray(array1);
            String korean2 = new String(array1);
            System.out.println(korean2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void printByteArray(byte[] array){
        for (byte data : array){
            System.out.print(data + " ");
        }
        System.out.println();
    }

}
