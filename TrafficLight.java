public class TrafficLight {
    private String color;
    private int duration;
    public TrafficLight(String color, int duration)
    {
        this.color = color;
        this.duration = duration;
    }
    public void changeColor(String newColor)
    {
        color = newColor;
    }
    public boolean isRed()
    {
        return color.equals("red");
    }
    public boolean isGreen()
    {
        return color.equals("Green");
    }
    public int getDuration()
    {
        return duration;
    }
    public void setDuration(int duration)
    {
        this.duration = duration;
    }
    public static void main(String[] args)
    {
        TrafficLight tl = new TrafficLight("red",30);
        System.out.println("The light is Red: "+tl.isRed());
        System.out.println("The light is Green: "+tl.isGreen());
        tl.changeColor("Green");
        System.out.println("After changing the color The new color is: "+tl.color);
        System.out.println("The Duration is: "+tl.getDuration());
        tl.setDuration(20);
        System.out.println("After changing the duration The new duration is: "+tl.duration);
    }
}
