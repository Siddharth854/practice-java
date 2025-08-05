public class Rectangle {
    double width;
        double height;
        public Rectangle(double width, double height)
        {
            this.width = width;
            this.height = height;
        }
        public double getWidth()
        {
            return width;
        }
        public void setWidth(double width)
        {
            this.width = width;
        }
        public double getHeight()
        {
            return height;
        }
        public void setHeight(double height)
        {
            this.height = height;
        }
        public double getArea()
        {
            return width * height;
        }
        public double getPerimeter()
        {
            return 2*(width+height);
        }
    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle(7,12);
        System.out.println("The Perimeter is: "+rect1.getPerimeter());
        System.out.println("The Area is: "+rect1.getArea());
        //mannually setting the values of height and bredth
        rect1.setHeight(40);
        rect1.setWidth(20);
        System.out.println("The area of Rectangle is: "+rect1.getArea());
        System.out.println("The Perimeter of Rectangle is: "+rect1.getPerimeter());
    }
}
