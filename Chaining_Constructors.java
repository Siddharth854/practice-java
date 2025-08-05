public class Chaining_Constructors 
{
    public int student_Id;
    public String student_Name;
    public char student_Grade;

    public Chaining_Constructors()
    {
        this(0,"unknown",' ');
    }

    public Chaining_Constructors(int student_Id, String student_Name, char student_Grade)
    {
        this.student_Id = student_Id;
        this.student_Name = student_Name;
        this.student_Grade = student_Grade;
    }

    public static void main(String[] args)
    {
        System.out.println("-----------------------------------------------");
        Chaining_Constructors student1 = new Chaining_Constructors();
        System.out.println(student1.student_Id);
        System.out.println(student1.student_Name);
        System.out.println(student1.student_Grade);
        System.out.println("-----------------------------------------------");

        Chaining_Constructors student2 = new Chaining_Constructors(1,"Siddharth",'A');
        System.out.println(student2.student_Id);
        System.out.println(student2.student_Name);
        System.out.println(student2.student_Grade);
        System.out.println("-----------------------------------------------");

    }
}
