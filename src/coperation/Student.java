package coperation;

public class Student  {
    String name;
    int money;
    int grade;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeBus(AbstractTrans bus) {
        //버스에 탑승 했고 1000원을 지불했음.
        bus.take(1000);
        addMoney(-1000);
        bus.showInfo();
    }

    public void takeSubway(AbstractTrans subway) {
        subway.take(1000);
        addMoney(-1000);
        subway.showInfo();
    }


    public void showInfo() {
        System.out.println(getName() + "님의 남은 돈은 " + getMoney() + " 입니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void addMoney(int money) {
        setMoney(getMoney() + money);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
