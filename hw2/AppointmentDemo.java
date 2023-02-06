// Mohammed Nabil Akbar
// Java Applications
// Professor Chu
// Due: 2/6/2023

// I am having weird formatting with my code because my IDE is being weird? when
// i try to save after every edit it indents

import java.util.Scanner;

public class AppointmentDemo {

    public static void main(String[] args) {

        Appointment[] appointment = new Appointment[10];
        appointment[0] = new Onetime(25, 12, 2017, " Root Canal");
        appointment[1] = new Monthly(25, 12, 2017, " Teeth Cleaning");
        appointment[2] = new Daily(25, 12, 2017, " Filling");
        appointment[3] = new Onetime(13, 12, 2017, " Crown");
        appointment[4] = new Monthly(15, 12, 2017, " Dentures");
        appointment[5] = new Daily(23, 11, 2022, " Filling");
        appointment[6] = new Onetime(2, 9, 2023, " Root Canal");
        appointment[7] = new Monthly(12, 9, 2023, " Teeth Cleaning");
        appointment[8] = new Daily(19, 10, 2023, " Filling");
        appointment[9] = new Onetime(5, 11, 2023, " Crown");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the day of the appointment (1-31) ");
        int day = keyboard.nextInt();
        System.out.println("Please input the month of the appointment (1-12) ");
        int month = keyboard.nextInt();
        System.out.println("Please input the year of the appointment ");
        int year = keyboard.nextInt();
        System.out.println(day + " " + month + " " + year);

        for (int i = 0; i < 10; i++) {
            if (appointment[i].occursOn(day, month, year) == true) {
                System.out.println(
                        "You have a" + appointment[i].getDesc() + " appointment on: " + month + ", " + day + ", "
                                + year);
            }
        }

        // if user chooses monthly, daily or onetime
        System.out.println("Choose the appointment by monthly, daily or onetime");
        String choice1 = keyboard.next();
        if (choice1.equalsIgnoreCase("monthly")) {
            for (int i = 0; i < 5; i++) {
                if (appointment[i].getDesc().equalsIgnoreCase(" Teeth Cleaning")) {
                    System.out.println(
                            "You have a" + appointment[i].getDesc() + " appointment on: " + appointment[i].getMonth()
                                    + ", " + appointment[i].getDay() + ", "
                                    + appointment[i].getYear());
                }
            }
        } else if (choice1.equalsIgnoreCase("daily")) {
            for (int i = 0; i < 10; i++) {
                if (appointment[i].getDesc().equalsIgnoreCase(" Filling")) {
                    System.out.println(
                            "You have a" + appointment[i].getDesc() + " appointment on: " + appointment[i].getMonth()
                                    + ", " + appointment[i].getDay() + ", "
                                    + appointment[i].getYear());
                }
            }
        } else if (choice1.equalsIgnoreCase("onetime")) {
            for (int i = 0; i < 10; i++) {
                if (appointment[i].getDesc().equalsIgnoreCase(" Root Canal")) {
                    System.out.println(
                            "You have a" + appointment[i].getDesc() + " appointment on: " + appointment[i].getMonth()
                                    + ", " + appointment[i].getDay() + ", "
                                    + appointment[i].getYear());
                }
            }
        } else {
            System.out.println("Invalid input");
        }

        // I wanted to add this to have the user choose the appointment by month, day or
        // year

        // user chooses month, day or year
        System.out.println("Choose the appointment by month, day or year");
        String choice = keyboard.next();
        // if user chooses month
        if (choice.equalsIgnoreCase("month")) {
            System.out.println("Please input the month of the appointment (1-12) ");
            int month1 = keyboard.nextInt();
            for (int i = 0; i < 10; i++) {
                if (appointment[i].getMonth() == month1) {
                    System.out.println("You have a" + appointment[i].getDesc() + " appointment on: " + month1 + ", "
                            + appointment[i].getDay() + ", "
                            + appointment[i].getYear());
                }

            }
            // if user chooses day
        } else if (choice.equalsIgnoreCase("day")) {
            System.out.println("Please input the day of the appointment (1-31) ");
            int day1 = keyboard.nextInt();
            for (int i = 0; i < 10; i++) {
                if (appointment[i].getDay() == day1) {
                    System.out.println(
                            "You have a" + appointment[i].getDesc() + " appointment on: " + appointment[i].getMonth()
                                    + ", " + day1 + ", "
                                    + appointment[i].getYear());
                }
            }
            // if user chooses year
        } else if (choice.equalsIgnoreCase("year")) {
            System.out.println("Please input the year of the appointment ");
            int year1 = keyboard.nextInt();
            for (int i = 0; i < 10; i++) {
                if (appointment[i].getYear() == year1) {
                    System.out.println(
                            "You have a" + appointment[i].getDesc() + " appointment on: " + appointment[i].getMonth()
                                    + ", " + appointment[i].getDay() + ", "
                                    + year1);
                }
            }
        } else {
            System.out.println("Invalid input");
        }

    }
}
