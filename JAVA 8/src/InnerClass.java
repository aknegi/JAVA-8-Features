
interface Demo{
    void display();
}
public class InnerClass {

    Integer myInteger=1;

    public void myMethod(){
        Demo demo=new Demo() {
            Integer myInteger=2;
            @Override
            public void display() {
                System.out.println(this.myInteger);
            }
        };
        demo.display();
    }

    public static void main(String[] args) {
        new InnerClass().myMethod();
    }
}
