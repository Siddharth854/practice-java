import java.time.LocalDate;
import java.time.Period;
public class Hiring_employee 
{
        private String name;
        private double salary;
        private LocalDate hiredate;
    public Hiring_employee(String name,double salary, LocalDate hiredate)
    {
        this.name = name;
        this.salary = salary;
        this.hiredate = hiredate;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public double getsalary()
    {
        return salary;
    }
    public void setsalary(double salary)
    {
        this.salary = salary;
    }
    public LocalDate gethiredate()
    {
        return hiredate;
    }
    public void sethiredate(LocalDate hiredate)
    {
        this.hiredate = hiredate;
    }
    public int getyearofservice()
    {
        return Period.between(hiredate,LocalDate.now()).getYears();
    }
    public void printEmployeeDetails()
    {
        System.out.println("name "+name);
        System.out.println("Salary: "+salary);
        System.out.println("HireDate: "+hiredate);
    }
    public static void main(String[] args)
    {
        Hiring_employee e1 = new Hiring_employee("Siddharth Joshi ",50000,LocalDate.parse("2021-01-01"));
        Hiring_employee e2 = new Hiring_employee("Harshit Khodani ",20000,LocalDate.parse("2022-02-14"));
        e1.printEmployeeDetails();
        System.out.println(e1.name+"`s Years of Service: "+e1.getyearofservice());
        System.out.println("----------------------------------");
        e2.printEmployeeDetails();
        System.out.println(e2.name+"`s Years of Service: "+e2.getyearofservice());
        System.out.println("----------------------------------");
    }
}
