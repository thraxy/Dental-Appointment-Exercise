public class Daily extends Appointment {

    // implement the Daily class
    public Daily(int day, int month, int year, String desc) {
        super(day, month, year, desc);
    }

    // implement the occursOn method
    public boolean occursOn(int day, int month, int year) {
        if (super.getDay() == day && super.getMonth() == month && super.getYear() == year) {
            return true;
        } else {
            return false;
        }
    }

    // implement the toString method
    public String toString() {
        return "Appointment on: " + super.getDay() + " " + super.getMonth() + " " + super.getYear() + " "
                + super.getDesc();
    }
}
