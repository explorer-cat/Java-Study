package hiding;

class BirthDay {
    private int day,month,year;

    public BirthDay(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
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
        if(month == 2) {
            if(getDay() < 1 || getDay() > 28) {
                System.out.println("날짜 오류 입니다.");
                this.month = 9999;
            }
        } else {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public BirthDay() {

    }

    public void showBirthday() {
        System.out.println("생일 : " + getYear() + "/" + getMonth() + "/" + getDay());
    }
}

public class BirthDayTest {

    public static void main(String[] args) {
        BirthDay day = new BirthDay(30,2,2023);
        day.showBirthday();

    }
}

