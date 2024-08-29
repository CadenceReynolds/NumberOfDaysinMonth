public class numberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(200));
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    private static boolean isLeapYear(int year) {
        if (year > 0 && year<= 9999) {
            return div4Check(year);
        } else {
            return false;
        }
    }

    private static boolean div4Check(int year) {
        if (year % 4 == 0) {
            return div100Check(year);
        } else {
            return false;
        }
    }

    private static boolean div100Check(int year) {
        if (year % 100 == 0) {
            return year % 400 == 0;
        } else {
            return true;
        }
    }

    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12){
            return -1;
        }
        if(year < 1 || year > 9999){
            return -1;
        }
        return switch(month){
            case 1 -> 31;
            case 2 -> {
                if(isLeapYear(year)){
                    yield 29;
                }
                yield 28;
            }
            case 3 -> 31;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 30;
            case 12 -> 31;
            default -> -1;
        };
    }
}
