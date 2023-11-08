public class Conditionals {
   
    public boolean chimpTrouble(boolean Asmile, boolean Bsmile){
        return (Asmile && Bsmile) || (!Asmile && !Bsmile);
    }


    public boolean negPos(int x, int y, boolean z){
        if (z == true){
            if (x<0 && y<0){
                return true;
            }
        }
        else{
            return (x>0 && y<0) || (x<0 && y>0);}
        return false;
    }
   
    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if (isAsleep == true) {
            return false;
            }
        else if (isMorning == true) {
            return isMom;
            }
        else {
            return true;
            }
        }
   
    public String setAlarm(int x, boolean y){
        if (y == true) {
            if (x >= 1 && x <= 5) {
                return "10:00";
            } else {
                return "off";
            }
        } else {
            if (x >= 1 && x <= 5) {
                return "7:00";
            } else {
                return "10:00";
            }
        }
    }

    public boolean onesDigitSame(int a, int b, int c){
        return a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10; 
    }

    public int blackjack(int x, int y){
        if(x <= 21 && y <= 21){
            if (x < y){
                return y;
            }
            return x;
        } else if(x > 21 && y > 21){
            return 0;
        }
        else if(x - y > 0){
            return y;
        } 
        else if(y - x > 0){
            return x;
        }
        return 0;
    }
     
    public static void main(String [] args){
        Conditionals ab = new Conditionals();
        // testing method 1
        System.out.println(ab.chimpTrouble(true, true));
        System.out.println(ab.chimpTrouble(false, false));
        System.out.println(ab.chimpTrouble(true, false));
        System.out.println(ab.chimpTrouble(false, true));
        System.out.println("\n");

        // testing method 2
        System.out.println(ab.negPos(1, -1, false));
        System.out.println(ab.negPos(-1 , 1, false));
        System.out.println(ab.negPos(1 , 1, false));
        System.out.println(ab.negPos(-1, -1, false));
        System.out.println(ab.negPos(-4, -5, true));
        System.out.println(ab.negPos(-4 , 5, true));
        System.out.println(ab.negPos(4, 5, true));
        System.out.println(ab.negPos(4, -5, true));
        System.out.println("\n");

        // testing method 3
        System.out.println(ab.pickUpPhone( false, false, true));
        System.out.println(ab.pickUpPhone (true, true, true));
        System.out.println(ab.pickUpPhone (true, true, false));
        System.out.println(ab.pickUpPhone (false, true, false));
        System.out.println(ab.pickUpPhone (true, false, false));
        System.out.println(ab.pickUpPhone (false, false, false));
        System.out.println("\n");

        // testing method 4
        System.out.println(ab.setAlarm(1, false));
        System.out.println(ab.setAlarm(5, false));
        System.out.println(ab.setAlarm(0, false));
        System.out.println(ab.setAlarm(2, true));
        System.out.println(ab.setAlarm(4, true));
        System.out.println(ab.setAlarm(6, true));
        System.out.println("\n");

        // testing method 5
        System.out.println(ab.onesDigitSame(23, 19, 13));
        System.out.println(ab.onesDigitSame(23, 19, 12));
        System.out.println(ab.onesDigitSame(23, 19, 3));
        System.out.println(ab.onesDigitSame(423, 13, 3));
        System.out.println(ab.onesDigitSame(23, 29, 25));
        System.out.println("\n");

        // testing method 6
        System.out.println(ab.blackjack(19, 21));
        System.out.println(ab.blackjack(21, 19));
        System.out.println(ab.blackjack(19, 22));
        System.out.println(ab.blackjack(8, 8));
        System.out.println(ab.blackjack(25, 24));
        System.out.println(ab.blackjack(17, 9));
        System.out.println(ab.blackjack(12, 18));

    }


}



