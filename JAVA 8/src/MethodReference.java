import java.util.function.Predicate;

interface Operations {
    int performOperation(int a, int b);
    static int action(int a, int b){
        return 2;
    }
}

public class MethodReference {

    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {

        Operations operations = MethodReference::add;
        System.out.println(Operations.action(3, 4));



        Predicate<Integer> greaterThan10 = a -> a > 10;
        Predicate<Integer> lessThan10 = a -> a < 10;
        System.out.println(greaterThan10.test(4));
        System.out.println(lessThan10.test(1));

    }
}
