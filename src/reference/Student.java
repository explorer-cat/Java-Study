package reference;

public class Student {
    int studentId;
    String studentName;

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

    public Subject getKorea() {
        return korea;
    }

    public void setKorea(Subject korea) {
        this.korea = korea;
    }

    public Subject getMath() {
        return math;
    }

    public void setMath(Subject math) {
        this.math = math;
    }

    Subject korea;
    Subject math;

    public Student() {
        korea = new Subject("국어");
        math = new Subject("수학");
    }

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        korea = new Subject("국어");
        math = new Subject("수학");
    }


    public void setKorea(int score) {
//        korea.setSubjectName(name);
        korea.setScore(score);
    }

    public void setMath(int score) {
//        math.setSubjectName(name);
        math.setScore(score);
    }

    public void showStudentInfo() {
        int total = korea.getScore() + math.getScore();
//        System.out.println();
        System.out.println(getStudentName() + " : " +korea.getSubjectName() +"," + math.getSubjectName() + " 총합: "+ total);
    }
}
