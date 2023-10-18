public class Circle {
    private double rad;

    public Circle(double rad) //Default Contructor
    {
    this.rad = rad;   
    }
    public double area(){
        double a = Math.PI *(Math.pow(rad,2));
        return a;
    }
    public double circumference(){
        double c = Math.PI*(2*rad);
        return c;
    }

}
