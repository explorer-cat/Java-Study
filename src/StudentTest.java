public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100,"이순신");
//        studentLee.setStudentName("이순신");
//        studentLee.setStudentId(100);
        studentLee.setAddress("서울시 영등포구 여의도동");

        Student studentKim = new Student(100,"김유신");
//        studentKim.setStudentName("김유신");
//        studentKim.setStudentId(100);
        studentKim.setAddress("서울시 영등포구 서초동");

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();

        System.out.println("lee: " + studentLee);
        System.out.println("kim: " + studentKim);
    }
}
