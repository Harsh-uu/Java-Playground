import java.util.Scanner;
public class que5{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows in pattern : ");
        int num = scan.nextInt();
        for (int i = 0; i != num ; i++) {
            for (int j = 0; j != i + 1 ; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
