
interface Demo2{
    void display();
}

public class Lambda {

    Integer myInteger=1;

    public void myMethod(){
        Demo2 demo2=()-> {
            Integer myInteger=2;
            System.out.println(this.myInteger);
        };
        demo2.display();
    }

    public static void main(String[] args) {
        new Lambda().myMethod();
    }
}
