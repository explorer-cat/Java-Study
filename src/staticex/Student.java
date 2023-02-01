package staticex;

public class Student {

    static int serialNum = 10000;

    int studentId;
    String studentName;


    public static int getSerialNum() {
        int i = 10;//지역변수
        i++;
        System.out.println("i"+i);
        return serialNum; // static 변수,클래스 변수
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Student() {
        serialNum++;
        studentId = serialNum;
    }
}
