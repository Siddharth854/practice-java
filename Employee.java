public class Employee 
{
    private String name;
    private String jobTitle;
    private double salary;
    
    Employee(String name, String jobTitle, double salary)
    {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getJobtitle()
    {
        return jobTitle;
    }
    public void setJobtitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    public void raiseSalary(double percentage)
    {
        salary = salary+salary*percentage/100;
    }
    public void printEmployeeDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Job title: "+jobTitle);
        System.out.println("Salary: "+salary);
        System.out.println("----------------------------------");
    }
    
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Siddharth Joshi","Software engineer",40000);
        Employee e2 = new Employee("Harshit","Sales",32000);
        System.out.println("----------------------------------");
        e1.printEmployeeDetails();
        e2.printEmployeeDetails();
        e1.raiseSalary(8);
        e2.raiseSalary(12);
        System.out.println("After raising salary");
                System.out.println("----------------------------------");

        e1.printEmployeeDetails();
        e2.printEmployeeDetails();
    }
}
