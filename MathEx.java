public class MathEx {
    public static void main(String [] args){
        System.out.println(swap(123));
        System.out.println(swap(329));
        System.out.println(swap(412));
    }
    public static int swap(int x){
        int number = (x/10)%10;
        int number2 = x%10;
        int number3 = (x/100)%10;
        int result = number3*100 + number*1 + number2*10;
        return result;
    }
}
