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

    public Complex add(double a){
        double a2 = this.a + a;
        double b2 = this.b + b;
        return new Complex(a2, b2);
    }

    //mult methods
    public Complex multiply(Complex other){
        double a3 = ((this.a*other.a)-(this.b*other.b));
        double b3 = ((this.a*other.a)+(this.b*other.b));
        return new Complex(a3,b3);
    }

    public Complex multiply(double a){
        double a3 = ((this.a*a)-(this.b*b));
        double b3 = ((this.a*a)+(this.b*b));
        return new Complex(a3,b3);
    }

    //Main
    public static void main(String [] args){
        Complex c1 = new Complex(3,4);
        Complex c2 = new Complex(-3,4);
        
        Complex c3 = new Complex(3,-4);
        Complex c4 = new Complex(3);

        Complex c5 = new Complex(0.0,4);
        Complex c6 = new Complex(-3,-4);

        Complex c7 = new Complex(5,4);
        Complex c8 = new Complex(-5,4);

        Complex c9 = new Complex(5,-4);
        Complex c10 = new Complex(5);

        System.out.println((c1.add(c2)));
        System.out.println(c3.add(c4));
        
        System.out.println(c5.abs());
        System.out.println(c6.abs());

        System.out.println(c7.multiply(c8));
        System.out.println(c9.multiply(c10));
    } 
}