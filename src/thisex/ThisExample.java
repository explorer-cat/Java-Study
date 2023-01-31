package thisex;


class BirthDay {
    int day,month,year;

    public void printThis() {
        System.out.println(this);
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
public class ThisExample {
    public static void main(String[] args) {
        BirthDay day1 = new BirthDay();
        BirthDay day2 = new BirthDay();

        System.out.println("11 :" + day1);
        System.out.println("22 :" + day2);
        day1.printThis();
        day2.printThis();
    }
}
