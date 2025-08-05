public class Circle {
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double setRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    public double getCircumference()
    {
        return 2*Math.PI*radius;
    }
    public static void main(String[] args)
    {
        double r = 7;
        Circle c = new Circle(r);
        System.out.println("The area of circle is: "+c.getArea());
        System.out.println("The Circumference of Circle is: "+c.getCircumference());
        c.setRadius(5);
        System.out.println("The area of Circle is: "+c.getArea());
        System.out.println("The Circumference of Circle is: "+c.getCircumference());
    }
}
