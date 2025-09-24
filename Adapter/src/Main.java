public class Main {
    public static void main(String[] args) {
        NewDateInterface date = new CalendarToNewDateAdapter();

        date.setDay(30);
        date.setMonth(11);
        date.setYear(2025);
        System.out.println("date after set: " + date.getDay() + "." + date.getMonth() + "." + date.getYear());

        date.advanceDays(30);
        System.out.println("date after advance: " + date.getDay() + "." + date.getMonth() + "." + date.getYear());
    }
}
