import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Find the first even number in the integer list which is greater than 3.
public class Question12 {
    public static void main(String[] args) {
        sumOfGreaterThan5(List.of(1, 2, 1, 3, 5, 7, 9, 3, 6, 5, 7, 8, 9, 8, 10, 2, 3));
    }

    public static void sumOfGreaterThan5(List<Integer> numbers) {
        System.out.println(numbers.stream()
                .sorted(Comparator.comparing((x -> x)))
                .collect(Collectors.toList()));
    }
}

