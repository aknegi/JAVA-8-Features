import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void findWord(List<String> wordList) {
        wordList.stream()
                .filter(w-> {
                    System.out.println(w);
                    return w.length()<5;
                })
                .map(w -> w.length())
                .forEach(System.out::println);
    }
    /*public static void performOperations(List<Integer> integerList);
    {
    }*/

    public static void main(String[] args) {
   //     findWord(List.of("Hello Hi", "Hi yeah", "yes", "Hi", "Hi JAVA"));
        // performOperations(List.of(23,3,3,4,10,5));

        List<Integer> list1=new ArrayList<>();
        List<Integer>list2=List.of(1,2,3);
        list1.removeAll(list2);
        System.out.println( list1);



    }
}