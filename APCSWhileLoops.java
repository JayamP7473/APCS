public class APCSWhileLoops {

    public int addOdds(int n){
        int sum = 0;
        int x = 1;
        while(x <= n){
            sum += x;
            x = x + 2;
        }
        return sum;
    }

    public int sumDigits(int n){
        int sum = 0;
        while (n>0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int howManyYears(double startpop, double endpop){
        int x = 0;
        while(startpop < endpop){
            startpop += startpop * (.0113);
            x = x + 1;
        }
        return x;
    }
    public void printSum(int n){
        int sum = 0;
        int x = 1;
        while (x <= n){
            System.out.print(x);
            sum = sum + x; 
            x = x + 1;
            if (x<=n){ System.out.print("+");}
        }
        System.out.println("=" + sum);
    }

    public boolean isPerfectSquare(int n){
        int sum = 0;
        int x = 1;
        while (sum < n){
            sum += x;
            x += 2; 
        }
        return (sum == n);
    }

    public static void main (String [] args){
        APCSWhileLoops WhileEX = new APCSWhileLoops();
        // Exercise 1

        System.out.println(WhileEX.addOdds(10));
        System.out.println(WhileEX.addOdds(100));
        System.out.println(WhileEX.addOdds(1000));
        System.out.println();

        // Exercise 2
        System.out.println(WhileEX.sumDigits(12345));
        System.out.println(WhileEX.sumDigits(1234));
        System.out.println(WhileEX.sumDigits(123));
        System.out.println();

        // Exercise 3
        System.out.println(WhileEX.howManyYears(111.2, 120));
        System.out.println(WhileEX.howManyYears(111.2, 150));
        System.out.println("");

        // Exercise 4
        WhileEX.printSum(6);
        WhileEX.printSum(7);
        WhileEX.printSum(8);
        WhileEX.printSum(9);
        System.out.println("");

        // Exercise 5
        System.out.println(WhileEX.isPerfectSquare(25));
        System.out.println(WhileEX.isPerfectSquare(49));
        System.out.println(WhileEX.isPerfectSquare(15));
        System.out.println(WhileEX.isPerfectSquare(13));

    }
}