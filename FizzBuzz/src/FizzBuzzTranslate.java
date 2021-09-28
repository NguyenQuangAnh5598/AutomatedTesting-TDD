public class FizzBuzzTranslate {
    public static String getFizzBuzzTranslate(int number) {
        String translate = checkNumber(number);
        boolean isDivisibleBy3 = number%3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;

        if (isDivisibleBy3 && isDivisibleBy5) {
            translate = "FizzBuzz";
        }else if (isDivisibleBy3) {
            translate = "Fizz";
        }else if (isDivisibleBy5) {
            translate = "Buzz";
        }else if (checkNumber1(number)) {
           translate = "Fizz";
        }else if (checkNumber2(number)) {
            translate = "Buzz";
        }

        return translate;
    }
    public static boolean checkNumber1(int num){
        boolean check = false;
        int checkNum1 = (num - num%10)/10;
        if (checkNum1 == 3 ){
            check = true;
        }
        if (checkNum1 == 5) {
            check = true;
        }
        return check;
    }
    public static boolean checkNumber2(int num){
        boolean check = false;
        int checkNum2 = num%10;
        if (checkNum2 == 3 ){
            check = true;
        }
        if (checkNum2 == 5) {
            check = true;
        }
        return check;
    }


    public static String checkNumber(int number){
        String trans;
        if(number>10) {
            int tens = (number - number % 10) / 10;
            int unis = number % 10;
            trans = read_a_digit(tens) +" "+ read_a_digit(unis);
        }else {
            trans=read_a_digit(number);
        }
        return trans;
    }

    private static String read_a_digit(int number) {
        String trans=null;
        switch (number){
            case 1: trans="Một";
                break;
            case 2: trans="Hai";
                break;
            case 4: trans="Bốn";
                break;
            case 6: trans="Sáu";
                break;
            case 7: trans="Bảy";
                break;
            case 8: trans="Tám";
                break;
            case 9: trans="Chín";
                break;
        }
        return trans;
    }
}
