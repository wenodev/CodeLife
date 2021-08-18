package ch12;

public class ManageStudent {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        manageStudent.checkEquals();
    }

    public void checkEquals(){
        Student student1 = new Student("Son", "Seoul", "01033221122", "qwe@gmail.com");
        Student student2 = new Student("Son", "Seoul", "01033221122", "qwe@gmail.com");
        System.out.println(student1.equals(student2));
    }

}
