package thisex;


class Person {
    String name;
    int age;

    public Person() {
        this("이름없음", 1);
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person returnSelf() {
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class CallAnotherConst {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);

        System.out.println(p1.returnSelf());

        Person person = p1.returnSelf();

        System.out.println(person.getName());

    }

}
