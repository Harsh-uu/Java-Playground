class Mobile{
    int price;
    String operating_system;
    int ram;
    Mobile (int price, String operating_system, int ram){
        this.price = price;
        this.operating_system = operating_system;
        this.ram = ram;
    }
    public void getProperties(){
        System.out.println("Price : " + price);
        System.out.println("RAM : " + ram);
        System.out.println("Operating System : " + operating_system);
    }
}
public class que12 {
    public static void main(String[] args) {
        Mobile nokia = new Mobile(60000, "Windows", 8);
        nokia.getProperties();
    }
}
