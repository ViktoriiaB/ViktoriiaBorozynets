package taskDays;

public enum DaysOfWeek {

    MON ("Monday"),
    TUE ("Tuesday"),
    WED ("Wednesday"),
    THU ("Thursday"),
    FRI ("Friday"),
    SAT ("Saturday"),
    SUN ("Sunday");

    String nameOfDay;

    DaysOfWeek(String nameOfDay) {
        this.nameOfDay = nameOfDay;
    }
}
