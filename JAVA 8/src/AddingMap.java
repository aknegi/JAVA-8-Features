import java.util.Comparator;
import java.util.List;


public class AddingMap {

    public static void numberSorting(List<String> numberlist) {
        numberlist.stream()
                .sorted(Comparator.comparing((String x) -> x.length()).thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        numberSorting(List.of("Secondd","third","First","Fourthhhh","Five"));
    }
}
/*

    public static void printSquare(List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .forEach(AddingMap::printSq);
    }
    public static List<Integer> courseLength(List<String> strings) {
        // returning a list of the length of the courses.
        return strings.stream()
                .map(course -> course.length())
                .collect(Collectors.toList());

    }
    public static void printSq(int num) {
        System.out.println(num);
    }

*/


