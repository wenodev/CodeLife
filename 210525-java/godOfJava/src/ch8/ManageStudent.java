package ch8;

public class ManageStudent {
    public static void main(String[] args) {

        ManageStudent manageStudent = new ManageStudent();

        Student[] student = null;
        student = manageStudent.addStudent();
        manageStudent.printStudents(student);
    }

    public Student[] addStudent(){
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook", "Seoul", "0103321122", "ask@gmail.com");
        return student;
    }

    public void printStudents(Student[] students){
        for (Student student : students){
            System.out.println(student);
        }
    }
}
