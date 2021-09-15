import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueTest {
    public static void main(String[] args) {

   /*     Integer arr[]={1,2,3,4};
        List<Integer>list=Arrays.asList(arr);
        System.out.println(list+":::list");
        arr[0]=55;
        System.out.println(list+":::list");
*/

        List<Integer> subIdlist = new ArrayList<>();
        subIdlist.add(111);
        subIdlist.add(222);
        subIdlist.add(333);
        List<Integer> dumpIdlist = new ArrayList<>();

        dumpIdlist.add(111);

        List<Integer> dumpList2=new ArrayList<>(dumpIdlist);

        System.out.println("dumpList2 "+dumpList2);
        dumpIdlist.removeAll(subIdlist);
        System.out.println("dumpSubId "+dumpIdlist);

        if(!dumpList2.isEmpty() && dumpIdlist.size()!= dumpList2.size()){
            System.out.println("hi");
        }
        else {
            System.out.println("no hi");
        }
    }
}