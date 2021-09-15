import com.sun.source.doctree.TextTree;

import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
interface TestingObj {
    public Testing get(int age, String name, String dept);
}

@FunctionalInterface
interface Opration {
    int display(int age);
}

public class Testing {
    private int age;
    private String name;
    private String dept;

    public static int multiply(int a) {
        return a * 12;
    }

    public static void main(String[] args) {
        Opration mul = Testing::multiply;
        System.out.println(mul.display(5));

        /* Creating Constructor reference
         */
        /*TestingObj testingObj = (a, b, c) -> new Testing(a, b, c);
        Testing obj1 = testingObj.get(12, "K", "RWARUB");
        Testing obj2 = testingObj.get(13, "si", "jVa");*/

        Predicate<Integer> checkEven = a -> a % 2 == 0;
        System.out.println(checkEven.test(4));


        //performOperations(List.of(1, 2, 4, 5, 7, 6, 4));
        // performStringOperations(List.of("one","two","three","four"));

//        testingObjects(List.of(new Testing(),new Testing(),new Testing(),new Testing()));
    }

    private static void testingObjects(List<Testing> testings) {
        testings.stream()
                .forEach(Testing::printObj);
    }

    private void printObj() {
        System.out.println("hi");
    }


    private void performStringOperations(List<String> counting) {
        counting.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

/*    private static void performOperations(List<Integer> numbers) {
        Predicate<Integer> evenCheck = e -> e % 2 == 0;
        numbers.stream()
                .filter(evenCheck)
                .forEach(new Testing()::print);
    }
    private void print() {
        System.out.println();
    }*/

}
