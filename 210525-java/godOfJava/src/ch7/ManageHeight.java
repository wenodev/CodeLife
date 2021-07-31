package ch7;

public class ManageHeight {

    private static int[][] gradeHeights = new int[5][];

    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();
        int count=0;
        while(true){
            if (count == 5) {break;}
            manageHeight.printAverage(count);
            count++;
        }
//        manageHeight.printHeight();
    }

    public void setData(){
        gradeHeights = new int[][]{
                {170, 180, 173, 175, 177},
                {160, 165, 167, 186},
                {158, 177, 187, 176},
                {173, 182, 181},
                {170, 180, 165, 177, 172}
        };
    }

    public void printHeight(){
        int size1 = gradeHeights.length;
        for(int i=0; i < size1; i++ ){
            System.out.println("Class NO.:" + (i+1));
            for (int number : gradeHeights[i]){
                System.out.println(number);
            }
        }
    }

    public void printAverage(int classNo){
        System.out.println("Class NO.:" + (classNo+1));
        int size = gradeHeights[classNo].length;
        double sum = 0;
        for (int number : gradeHeights[classNo]){
            sum += number;
        }
        System.out.println("Height average:" + sum/size);
    }

}
