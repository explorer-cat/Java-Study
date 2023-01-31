public class Student {
    int studentId;
    String studentName;
    int grade;
    String address;
    //클래스에 생성자가 없을 경우 jvm이 자동으로 디폴트 생성자를 생성해서 돌림. 우리눈에는 안보임.


    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void showStudentInfo() {
        System.out.println(getStudentName() + ", " + getStudentId() + "," +getAddress() );
    }

}
