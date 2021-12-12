package taskDays;

public class Days {

    public static void main(String[] args) {

        DaysOfWeek day1 = DaysOfWeek.MON;
        System.out.println(day1.nameOfDay);

        DaysOfWeek day2 = DaysOfWeek.TUE;
        System.out.println(day2.nameOfDay);

        DaysOfWeek day3 = DaysOfWeek.WED;
        System.out.println(day3.nameOfDay);

        DaysOfWeek day4 = DaysOfWeek.THU;
        System.out.println(day4.nameOfDay);

        DaysOfWeek day5 = DaysOfWeek.FRI;
        System.out.println(day5.nameOfDay);
        System.out.println("Number of Friday - "+ day5.ordinal());

        DaysOfWeek day6 = DaysOfWeek.SAT;
        System.out.println(day6.nameOfDay);

        DaysOfWeek day7 = DaysOfWeek.SUN;
        System.out.println(day7.nameOfDay);


    }


}
