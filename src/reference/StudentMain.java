package reference;

public class StudentMain {
    public static void main(String[] args) {
        Student studentJames = new Student(100, "james");
        studentJames.setKorea(100);
        studentJames.setMath(90);

        studentJames.showStudentInfo();

        Student studentKim = new Student(100, "kim");
        studentKim.setKorea(30);
        studentKim.setMath(40);

        studentKim.showStudentInfo();

    }
}
