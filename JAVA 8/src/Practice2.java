import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Practice2 {
    public static void main(String[] args) {

       /* List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(
                list.stream()
                        .mapToInt(e -> e).max()
        );
*/
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
        System.out.println(
                list2.stream()
                        .collect(Collectors.averagingInt(x -> x * 2))
        );

/*
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4);
        System.out.println(
                list3.stream()
                        .collect(Collectors.counting())
        );*/
       /* System.out.println(getFunctionInteraces(List.of(2, 6, 5, 4, 3, 5, 6, 7)));
        getReducer(List.of(2, 6, 5, 4, 3, 5, 6, 7));
        System.out.println(getComparision("SachinTendulkar", "SachinTendulkar"));*/
    }

    private static boolean getComparision(String s1, String s2) {
        BiPredicate<String, String> compare = (x, y) -> x.length() == y.length();
        return compare.test(s1, s2);
    }

    private static void getReducer(List<Integer> numbers) {
        //BinarOperator
        BinaryOperator<Integer> getSum = Integer::sum;
        int sum = numbers.stream()
                .reduce(0, getSum);
        System.out.println(sum);
    }

    public static int getFunctionInteraces(List<Integer> numbers) {
        //Function
        Function<Integer, Integer> getSquare = x -> x * x;
        //Predicate
        Predicate<Integer> getEven = x -> x * x == 0;

        return numbers.stream()
                .filter(getEven)
                .map(getSquare)
                .reduce(0, (x, y) -> x + y);
    }
}