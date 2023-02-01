package staticex;

import staticex.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student studentJ = new Student();
        System.out.println(studentJ.getStudentId());

        Student studentT = new Student();
        System.out.println(studentT.getStudentId());


        System.out.println(Student.getSerialNum());
        System.out.println(Student.getSerialNum());
    }
}
