public class NextDayCalculator {

    public static final String CONCATENATION = "/";

    public static String getNextDay(int day, int month, int year) {
        int lastOfMonth = getLastOfMonth(month,year);
        int lastOfYear = 12;

        int startOfMonth = 1;
        int startOfYear = 1;
        if (day == lastOfMonth) {
            if (month == lastOfYear) {
                month = startOfYear;
                day = startOfMonth;
                year++;
            } else {
                day = startOfMonth;
                month++;
            }
        } else {
            day++;
        }
        return day + CONCATENATION + month + CONCATENATION + year;
    }

    private static boolean checkYear(int year) {
        boolean isDivisibleBy4 = year % 4 == 0;

        boolean isLeapyear = false;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapyear = true;
                }
            } else {
                isLeapyear = true;
            }
        }
        return isLeapyear;
    }

    private static int getLastOfMonth(int month,int year) {
        int lastOfMonth = 0;
        if (month == 2 && checkYear(year)) {
            lastOfMonth = 29;
        }
        else {
            lastOfMonth = 28;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastOfMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastOfMonth = 30;
                break;
        }
        return lastOfMonth;
    }
}
