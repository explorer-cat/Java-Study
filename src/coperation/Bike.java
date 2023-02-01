package coperation;

public class Bike extends AbstractTrans {
    int busNumber,money = 0,peopleCount = 0;

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
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

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public void addPeopleCount(int num) {
        setPeopleCount(getPeopleCount() + num);
    }

    public Bike(int busNumber) {
        this.busNumber = busNumber;
    }

    @Override
    public void take(int money) {
        addPeopleCount(1);
        addMoney(money);
    }

    @Override
    public void exit(int money) {

    }

    @Override
    public void showInfo() {
        System.out.println(getBusNumber() + "번 버스의 수익은 " +getMoney() +"이고, 탑승자는 총 " +getPeopleCount() + "명 입니다.");
    }
}
