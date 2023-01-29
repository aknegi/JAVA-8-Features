import javax.swing.text.html.Option;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TV {
    List<String> channels;

    public List<String> getChannels() {
        return channels;
    }

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    public void remove() {
        this.channels.remove(0);
    }
}

/*class Node {
    Node next;
    int val;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}*/

public class Fixx {
    public static void main(String[] args) {
        int arr[] = new int[]{4, 4, 7, 8, 8, 9};
        int[] arrr = findDistinct(arr);
        for (int i = 0; i < arrr.length; i++) {
            System.out.println(arrr[i]);
        }
    }

    private static int[] findDistinct(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (countMap.containsKey(arr[i])) {
                countMap.put(arr[i], countMap.get(arr[i]) + 1);
            } else {
                countMap.put(arr[i], 1);
            }
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                count++;
            }
        }
        if (count == 0) {
            return new int[]{-1};
        }
        int[] resultArray = new int[count];
        count = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                resultArray[count] = entry.getKey();
                count++;
            }
        }
        return resultArray;
    }

    /* final public static void main(String args[]) {
     *//*  Optional GOT=Optional.of("Game of thrones");
        String [] str = new String[10];
        Optional strOpto = Optional.ofNullable(str[9]);
        System.out.println(strOpto.isPresent());
        System.out.println(GOT.isPresent());*//*


    }*/
    

  /*  private static Node reverseList(Node head) {
        Node prev = head;
        Node curr = head.next;
        Node temp = null;
        prev.next = null;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
*/
   /* private static void printLinkedList(Node head) {
        Node dummy = head;
        while (dummy != null) {
            System.out.println(dummy.val);
            dummy = dummy.next;
        }
    }*/

 /*   private static void createNode(Node head, int i) {
        Node node = new Node();
        node.val = i;
        if (head.next == null) {
            head.next = node;
        } else {
            Node dummy = head;
            while (dummy.next != null) {
                dummy = dummy.next;
            }
            dummy.setNext(node);
        }
    }
*/

    public static String changeDateFormat(String dateInString, String inputFormat, String outputFormat) {
        try {
            Date date = dateInString == null ? null : new SimpleDateFormat(inputFormat).parse(dateInString);
            return Objects.nonNull(date) ? new SimpleDateFormat("MMMM dd,yyyy").format(date) : null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
/*    public static LocalDate convertStringDate(String date, String format) {
        return (date != null && !date.equals("")) ? LocalDate.parse(date, DateTimeFormatter.ofPattern(format)) : LocalDate.now();
    }
*/
/*
        String endDate ="23-04-2022T00:00:00";
        LocalDateTime date = LocalDateTime.parse(endDate, DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm:ss"));
        System.out.println(date);
        String packDate = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(packDate);
        LocalDate newDate = LocalDate.parse(packDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println( newDate);*/
/*code to create file in resource folder
*
*         File file = new File("src/main/resources/rejectFile.csv");
        if (file.createNewFile()) {

            System.out.println("File has been created.");
        } else {

            System.out.println("File already exists.");
        }        File file = new File("src/main/resources/rejectFile.csv");
        if (file.createNewFile()) {

            System.out.println("File has been created.");
        } else {

            System.out.println("File already exists.");
        }
*
*
* */



