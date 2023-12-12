public class Factorials {

    //Exercise 3
    public long calcFactorial(int n){
        long sum = 1; 
        for (int x = 1 ; x < n ; x ++){
            sum += sum*x;
        }
        return sum;
    }
    
    //Exercise 2
    public double calcE(){
        double e = 1.0;
        double olde = 0.0;
        int counter = 1;
        while(e - olde > .001){
            olde = e;    
            e += 1.0/ calcFactorial(counter);
            counter ++;
                }
        return e;
    }

    //Exericse 3
    public double calcEX(int n){
        double e = 1.0;
        double olde = 0.0;
        int counter = 1;
        int x = 1;
        while(e - olde > .001){
            olde = e;    
            e += (Math.pow(n,x))/ calcFactorial(counter);
            x ++;
            counter ++;
                }
        return e;
    }

    public static void main (String [] args){
        Factorials ab = new Factorials();

        //Exercise 1
        for (int a = 1; a<=20; a++){
            System.out.println(ab.calcFactorial(a));

        } 
        System.out.println();

        //Exercise 2
        System.out.printf("e is %2.3f \n", ab.calcE());
        System.out.println();

        //Exercise 3
        for (int b = 1; b<=5; b++){
        System.out.printf("e is %2.3f \n", ab.calcEX(b));
        }
    }
}