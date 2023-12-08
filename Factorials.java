public class Factorials {
    public long calcFactorial(int n){
        long sum = 1; 
        for (int x = 1 ; x < n ; x ++){
            sum += sum*x;
        }
        return sum;
    }
    
    public double calcE(){
        double e = 1;
        double olde = 0;
        int counter = 1;
        while(e-olde > .001){
            e = e + 1/ calcFactorial(counter);
            counter ++;
            olde = e;        
        }
        return e;
    }

    public static void main (String [] args){
        Factorials ab = new Factorials();
        for (int a = 1; a<=20; a++){
            System.out.println(ab.calcFactorial(a));

        } 
        System.out.println(ab.calcE());

    }

}
