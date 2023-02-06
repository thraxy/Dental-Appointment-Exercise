public class Appointment {

    private int day;
    private int month;
    private int year;
    private String desc;

    // implement the Appointment class
    public Appointment(int day, int month, int year, String desc) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.desc = desc;
    }

    // implement getters
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDesc() {
        return desc;
    }

    // implement the occursOn method
    public boolean occursOn(int day, int month, int year) {
        if (this.day == day && this.month == month && this.year == year) {
            return true;
        } else {
            return false;
        }
    }

    // implement the toString method
    public String toString() {
        return "Appointment on: " + day + " " + month + " " + year + " " + desc;
    }

}
