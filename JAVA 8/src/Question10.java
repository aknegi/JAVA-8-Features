//Sum all the numbers greater than 5 in the integer list.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Question10 {
    public static void main(String[] args) {

        Studentss s1= null;
        Studentss s2= new Studentss();
        s2.setRoll(2);
        sumOfGreaterThan5(Arrays.asList(s1,s2));
    }

    public static void sumOfGreaterThan5(List<Studentss> students) {
        System.out.println(students.stream()
                .filter(Objects::nonNull)
                .map(Studentss::getRoll).max(Comparator.naturalOrder()));
    }
}

class  Studentss{
    int roll;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
