class Base{
    int number = 5;
}
class Child extends Base{
    void change (int n){
        super.number = n;
    }
}
public class que13 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.change(4);
        System.out.println(obj.number);
    }
}
