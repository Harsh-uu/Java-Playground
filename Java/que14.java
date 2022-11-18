class Box{
    double width;
    double height;
    double depth;
    Box (double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume() {
        return width * height * depth;
    }
}
public class que14 {
    public static void main(String[] args) {
        Box obj = new Box(2.5, 7, 5.3);
        System.out.println("Volume : " + obj.volume());
    }
}
