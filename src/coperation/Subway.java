package coperation;

public class Subway extends AbstractTrans {
    int number,money = 0,people = 0;

    public Subway(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public void addPeople(int num) {
        setPeople(getPeople() + num);
    }



    @Override
    public void take(int money) {
        addPeople(1);
        addMoney(money);
    }

    public void showInfo() {
        System.out.println(getNumber() + "번 지하철의 수익은 " +getMoney() +"이고, 탑승자는 총 " +getPeople() + "명 입니다.");
    }


}
