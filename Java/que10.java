abstract class Base{
    abstract void square (int n);
    abstract void cube (int n);
}
class Child extends Base{
    @Override
    void square(int n) {
        System.out.println("Square of " + n + " : " + n * n);
    }

    @Override
    void cube(int n) {
        System.out.println("Cube of " + n + " : " + n * n * n);
    }
}
public class que10{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.square(4);
        obj.cube(3);
    }
}  
