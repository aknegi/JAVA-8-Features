import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Student {
    private String Name;
    private double Score;
    private double Age;

    public Student(String name, double score, double age) {
        Name = name;
        Score = score;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public double getScore() {
        return Score;
    }

    public double getAge() {
        return Age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Score=" + Score +
                ", Age=" + Age +
                '}';
    }
}

public class WrokingWithClasses {
    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student("Adarsh Singh", 89.0, 16.0),
                new Student("Nakul Kumar", 87.0, 16.0),
                new Student("Aman Sharma", 70.0, 17.0),
                new Student("Mehul kohli", 84.0, 16.0),
                new Student("Akriti Dhoni", 90.0, 17.0)
        );
        applyFunctions(studentList);
    }

    public static void applyFunctions(List<Student> studentList) {
        boolean ageIsMoreThan10 = studentList.stream().allMatch(s -> s.getAge() > 10);
        System.out.println(ageIsMoreThan10);


        //sorting by score in increasing order.
        Comparator<Student> comparator = Comparator.comparing(Student::getScore);
        List<Student> sortedByScoreIncreasing = studentList.stream()
                .sorted(comparator).collect(Collectors.toList());
        System.out.println(sortedByScoreIncreasing);


        //sorting by score in Decreasing order. in reverse order
        Comparator<Student> comparatorDecreasing = Comparator.comparing(Student::getScore).reversed();
        List<Student> sortedByScoreDecreasing =
                studentList
                        .stream()
                        .sorted(comparatorDecreasing)
                        .collect(Collectors.toList()); // collecting the result in a list
        System.out.println(sortedByScoreDecreasing);

        // limit demonstration
        System.out.println(studentList
                .stream()
                .sorted(comparatorDecreasing)
                .limit(3)
                .collect(Collectors.toList()));


        // Skip demonstration
        System.out.println(studentList
                .stream()
                .sorted(comparatorDecreasing)
                .skip(2)
                .collect(Collectors.toList()));


        // to get the middle values we can use skip and limit together
        // We have 5 objects and we want the 3rd object so we can do...
        System.out.println(studentList
                .stream()
                .sorted(comparatorDecreasing)
                .skip(2)
                .limit(1)
                .collect(Collectors.toList()));

        // If we want all the data before any perticular elements encounters, we can use
        // takeWhile
        System.out.println(sortedByScoreIncreasing
                .stream()
                .takeWhile(student -> student.getScore() < 87)
                .collect(Collectors.toList()));


        // If we  don't want all the data before any perticular elements encounters, we can use
        // dropWhile
        System.out.println(sortedByScoreIncreasing
                .stream()
                .dropWhile(student -> student.getScore() < 87)
                .collect(Collectors.toList()));

        // to get the last value we use max and to get the first value we use min
        Comparator<Student> getElement = Comparator.comparing(Student::getScore);
        System.out.println(sortedByScoreIncreasing
                .stream()
                .max(getElement));

        System.out.println(sortedByScoreIncreasing
                .stream()
                .min(getElement)
                .orElse(new Student("Akriti Dhoni", 90.0, 17.0)));// if there is no such element
        // then return the given element

        // to get the first element which meet the condition we use
        // findFirst()
        Predicate<Student> scoreLessThan87 = student -> student.getScore() < 90;
        System.out.println(studentList
                .stream()
                .filter(scoreLessThan87)
                .findFirst());

        // to get the all element which meet the condition we use
        // findAny()

        System.out.println(studentList
                .stream()
                .filter(scoreLessThan87)
                .findAny());
    }

    public static void print(Student stu) {
        System.out.println(stu.getName());
    }


}
