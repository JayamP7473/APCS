public class Cylinder {
    private Circle circle;
    private double height;

    public Cylinder(double rad, double height){
        this.circle = new Circle(rad);
        this.height = height;
    }
    public double vol(){
        double v = height*circle.area();
        return v;
    }

    public double sa(){
        double s = (circle.circumference()*height) + (circle.area()*2);
        return s;
    }
}
