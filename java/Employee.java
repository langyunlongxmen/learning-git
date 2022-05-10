public class Employee {
    private String empId;
    private int age;
    private String name;
    private char gender;
    private int salary;

    public Employee(String empId, 
                    int age, 
                    String name,
                    char gender,
                    int salary) {
        this.empId = empId;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public String getEmpId() {return empId;}

    public int getAge() {return age;}

    public String getName() {return name;}

    public char getGender() {return gender;}

    public int getSalary() {return salary;}


}


