import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamfilter {
    public static void main(String[] args) {
        List<Employee> empList = List.of(
            new Employee("E001", 40, "Ram", 'M', 50000),
            new Employee("E002", 35, "Shelly", 'F', 70000),
            new Employee("E003", 24, "Mark", 'M', 90000),
            new Employee("E004", 37, "Rani", 'F', 100000),
            new Employee("E005", 34, "Anuj", 'M', 120000)
        ); 
    long count = empList.stream().filter(n -> n.getSalary() >=100000).count();
    System.out.println("Employees with salary >=100000: " + count);

    // List<Employee> eList = empList.stream().filter(n -> (n.getName().startsWith("A")))
    //                               .collect(Collectors.toList());
    List<Employee> eList = empList.stream().filter(n -> (n.getName().equals("Anuj")))
                                  .collect(Collectors.toList());
    eList.forEach(System.out::println);

    List<String> nameList = empList.stream().filter(n -> (n.getGender() == 'F'))
                                   .map(Employee::getName).collect(Collectors.toList());
    System.out.println(nameList);
    }
}
