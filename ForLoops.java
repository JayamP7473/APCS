public class ForLoops{
    
    public int addEvens(int n){
        int sum = 0;
        for (int a = 0; a <= n; a+= 2){
            sum += a;
        }
        return sum;

    }

    public void printSquaresBack(int n){
        int sum = 0;
        for (int a = n; a > 0; a--){
            sum = n*n;
            n -= 1;
            System.out.print(sum);
            if (n > 0){
            System.out.print(",");
            }
        }
        
    }

    public void sillyNumbers(){
        for (int a = 0; a< 3; a++){
                for (int n = 0; n<=9; n++){
                    for (int b = 0; b< 3; b++)
                    System.out.print(n);
                }
                System.out.println();
            
        }

    }

    public void sillyNumbers2(){
        for (int a = 0; a< 3; a++){
                for (int n = 9; n>=0; n--){
                    for (int b = 0; b< n; b++)
                    System.out.print(n);
                }
                System.out.println();
        }
    }

    public void dollarsAndStars(){			
        for(int i = 0; i <7; i++){
            for(int j = 1; j<=i*2; j++){
                System.out.print("*");
            }
            for(int j = 7; j>=i+1; j--){
                    System.out.print("$");
                }
            for(int j = 14; j>i*2; j--){
                System.out.print("*");
            }
            for(int j = 7; j>=i+1; j--){
                    System.out.print("$");
                }
            for(int j = 1; j<=i*2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main (String[] args){
        ForLoops Fl = new ForLoops();

        // Exercise 1
        System.out.println(Fl.addEvens(6));
        System.out.println(Fl.addEvens(10));
        System.out.println(Fl.addEvens(14));
        System.out.println(Fl.addEvens(18));
        System.out.println(Fl.addEvens(20));
        System.out.println();

        //Exercise 2
        Fl.printSquaresBack(4);
        System.out.println();
        Fl.printSquaresBack(10);
        System.out.println();
        Fl.printSquaresBack(8);
        System.out.println();
        Fl.printSquaresBack(12);
        System.out.println("\n");

        //Exercise 3
        Fl.sillyNumbers();
        System.out.println();

        //Exercise 4
        Fl.sillyNumbers2();
        System.out.println();

        //Exercise 5
        Fl.dollarsAndStars();
    }

}