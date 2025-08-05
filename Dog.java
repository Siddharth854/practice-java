public class Dog 
{
    String name;
    String breed;
    public Dog(String name,String breed)
    {
        this.name = name;
        this.breed = breed;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getBreed()
    {
        return breed;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    public static void main(String[] args)
    {
        //getting name and breed from function getName and getBreed
        Dog d1 = new Dog("sunny","Rottewiler");
        System.out.println(d1.getName()+" "+d1.getBreed());
        
        //manually updating name and breed from setName and setBreed
        d1.setName("Rocky");
        d1.setBreed("Bulldog");
        System.out.println(d1.getName()+" "+d1.getBreed());
    }
}
