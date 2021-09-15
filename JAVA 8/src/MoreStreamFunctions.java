import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employees {
    private int empId;
    private String name;
    private String department;
    private int age;

    public Employees(int empId, String name, String department, int age) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }
}

public class MoreStreamFunctions {
    public static void main(String[] args) {
        printList(List.of("hello", "tothenew", "ttn"));
    }

    public static void printList(List<String> empList) {
        empList.stream()
                .map(str ->str.toUpperCase())
                .forEach(System.out::println);
    }
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

   /* new Employees(101, "Aditya Negi", "JAVA", 26); */




    public static void playWithStream(List<Employees> employeeList) {

        //getting all the departments in a string.
        /* System.out.println(*/
        /*         employeeList*/
        /*                 .stream()*/
        /*                 .map(employee -> Employee::getDepartment)*/
        /*                 .collect(Collectors.joining(" ,"))*/
        /* );*/
        System.out.println(
                employeeList
                        .stream()
                        .map(employee -> employee.getDepartment().split(","))
                        .flatMap(Arrays::stream).collect(Collectors.toList())
        );

        System.out.println(
                employeeList
                        .stream()
                        .filter(employee -> employee.getDepartment().equals("JAVA"))
                        .collect(Collectors.toList())
        );

        System.out.println(
                employeeList
                        .stream()
                        .collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.counting()))
        );

        System.out.println(
                employeeList
                        .stream()
                        .flatMap(employee -> Stream.of(employee.toString()))
                        .collect(Collectors.toList())
        );
    }
}
