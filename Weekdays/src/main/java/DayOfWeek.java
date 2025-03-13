public class DayOfWeek {

    public static String getDay(int input) {
        if (input > 7 || input < 1) return "Wrong, please enter a number between 1 and 7";
        return Weekday.values()[input - 1].toString();
    }


    enum Weekday {
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday;

    }
}
