import java.util.Scanner;
public class que11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        int radius = scan.nextInt();
        System.out.println("Area : " + Math.PI * radius * radius);
    }
}
