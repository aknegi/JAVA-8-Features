import java.util.HashMap;

class Example {
    public static int Hashcount=0;
    public static int EqualCount=0;
    private int id;
    private String name;

    public Example(int id, String name) {
        this.id = id;
        this.name=name;
    }

    @Override
    public int hashCode() {
        System.out.println("Hash");
        Hashcount++;
        System.out.println(this.id);
        System.out.println("HashCount= "+Hashcount);
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals");
        EqualCount++;
        System.out.println("EqualCount= "+EqualCount);
        return this.id == ((Example) o).id;
    }

    @Override
    public String toString() {
        return "Example{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class HashCode {
    public static void main(String[] args) {
        HashMap<Example, Example> newmap = new HashMap<>();

        Example e1 = new Example(101,"Ram");
        Example e2 = new Example(102,"Shyam");
        Example e3=new Example(102, "oom");

        //newmap.put(e1,e1);
        System.out.println("newmap.put(e2,e2);");
        newmap.put(e2,e2);
        System.out.println("newmap.put(e3,e3);");
        newmap.put(e3,e3);
        System.out.println("newmap.put(e3,e2);");
        newmap.put(e3,e2);

        System.out.println(newmap.get(e3));

    }
}


