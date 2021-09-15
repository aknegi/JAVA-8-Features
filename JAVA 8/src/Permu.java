import java.util.*;

public class Permu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
               List<Integer> batchSize = List.of(3, 2, 5, 7);
          List<Integer> processingTime = List.of(5, 4, 10, 12);
                   List<Integer> tasks = List.of(10, 6, 10, 5);
        System.out.println(minTime(batchSize,processingTime,tasks));
    }


    public static long minTime(List<Integer> batchSize, List<Integer> provessingTime, List<Integer> numTasks) {
    int maxTime=0;
    for(int i=0;i<batchSize.size();i++){
        int temp=execute(batchSize.get(i),provessingTime.get(i),numTasks.get(i));
        if(temp>maxTime){
            maxTime=temp;
        }
    }
    return maxTime;
    }

    public static int execute(int b, int p, int t) {
        int time = 0;
        time = (t / b) * p;
        if (t % b != 0) {
            time = time + p;
        }
        return time;
    }

}





/*static int count=0;
    static void permute(String s) {
        if (s.length() == 0) {
            count++;
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            String left_substr = s.substring(0, i);
            String right_substr = s.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest);
        }
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s;
        s = scan.next();
        permute(s);
        System.out.println( count);
    }*/