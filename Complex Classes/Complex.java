public class Complex{
    private double a;
    private double b;

    //Constructors
    public Complex(double a1, double b1){
        a = a1;
        b = b1;
    }

    public Complex(double a1){
        this(a1,0.0);    
    }

    //toString Method
    public String toString(){
        return a + "+" + b + "i";
    }

    //abs() Method
    public double abs(){
        double x = Math.sqrt((a*a)+(b*b));
        return x;
    }

    //add methods
    public Complex add(Complex other){
        double a2 = this.a + other.a;
        double b2 = this.b + other.b;
        return new Complex(a2, b2);
    }

    public Complex add(double a, double b){
        double a2 = this.a + a;
        double b2 = this.b + b;
        return new Complex(a2, b2);
    }

    //mult methods
    public Complex multiply(Complex other){
        double a3 = ((this.a*other.a)+(this.b*other.b));
        double b3 = ((this.a*other.a)-(this.b*other.b));
        return new Complex(a3,b3);
    }

    public Complex multiply(double a, double b){
        double a3 = ((this.a*a)+(this.b*b));
        double b3 = ((this.a*a)-(this.b*b));
        return new Complex(a3,b3);
    }

    //Main
    public static void main(String [] args){
        
    } 
}