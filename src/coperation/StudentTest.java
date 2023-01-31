package coperation;

public class StudentTest {
    public static void main(String[] args) {
        Bus bus = new Bus(13);
        Subway subway = new Subway(132);
        Student student = new Student("최성우", 10000);

        student.take(bus);
        student.showInfo();

        Student student1 = new Student("박경서", 20000);

        student1.take(subway);
        student1.showInfo();
    }
}
