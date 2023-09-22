public class MathEx {
    public static void main(String [] args){
        // Swap
        System.out.println(swap(123));
        System.out.println(swap(329));
        System.out.println(swap(412));

        //time left 
        timeLeft(1,15,4,36);
        timeLeft(1,34,8,20);
        timeLeft(1,35,9,21);
        timeLeft(1,37,12,27);

        // day of weeks
        System.out.println(dayOfWeek(0, 1));
        System.out.println(dayOfWeek(0, 14));
        System.out.println(dayOfWeek(6, 22));
        System.out.println(dayOfWeek(5, 4));
        System.out.println(dayOfWeek(2, 1));
        System.out.println(dayOfWeek(4, 18));

    }
    public static int swap(int x){
        int number = (x/10)%10;
        int number2 = x%10;
        int number3 = (x/100)%10;
        int result = number3*100 + number*1 + number2*10;
        return result;
    }
    public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
        int minutes1 = depMin - curMin;
        int hours1 = depHour - curHour;
        int total = hours1*60 + minutes1;
        int Hours2 = total/60;
        int min2 = total%60;
        System.out.println("You have " + Hours2 + " Hours and " + min2 + " minutes left ");
    }
    public static int dayOfWeek(int day, int date){
        int answer = (day + date - 1)%7;
        return answer;
    }
} 
