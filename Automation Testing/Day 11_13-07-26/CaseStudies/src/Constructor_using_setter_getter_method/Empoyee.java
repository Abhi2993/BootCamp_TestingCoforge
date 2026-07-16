
//write  java problem forConstructor_using_setter_getter_method employee having id name and sallery and  ssn


package Constructor_using_setter_getter_method;



class Employees {

    // Private data members
    private int id;
    private String name;
    private double salary;
    private String ssn;

    // Default Constructor
    public Employees() {
        System.out.println("Employee Object Created");
    }

    // Parameterized Constructor
    public Employees(int id, String name, double salary, String ssn) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.ssn = ssn;
    }

    // Setter Methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    // Getter Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getSsn() {
        return ssn;
    }

    // Display Method
    public void display() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
        System.out.println("Employee SSN : " + ssn);
    }
}

public class Empoyee {

    public static void main(String[] args) {

        // Using Default Constructor + Setter Methods
        Employees emp1 = new Employees();

        emp1.setId(101);
        emp1.setName("Abhinandan");
        emp1.setSalary(50000);
        emp1.setSsn("123-45-6789");

        System.out.println("Employee Details using Setter & Getter");
        System.out.println("ID : " + emp1.getId());
        System.out.println("Name : " + emp1.getName());
        System.out.println("Salary : " + emp1.getSalary());
        System.out.println("SSN : " + emp1.getSsn());

        System.out.println("\n-------------------------");

        // Using Parameterized Constructor
        Employees emp2 = new Employees(102, "Dhruv", 65000, "987-65-4321");

        System.out.println("Employee Details using Constructor");
        emp2.display();
    }
}