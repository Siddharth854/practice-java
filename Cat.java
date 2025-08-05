public class Cat
{
    private String name;
    private int age;
    public Cat(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public static void main(String[] args)
    {
        Cat myCat = new Cat("Whiskers", 3);
        System.out.println(myCat.getName());
        System.out.println(myCat.getAge());
    }
}
