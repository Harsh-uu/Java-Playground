import java.util.Scanner;
public class que3{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of integers : ");
        int num = scan.nextInt(), max = Integer.MIN_VALUE;
        for (int i = 1; i <= num; i++) {
            System.out.print("Enter integer " + i + " : ");
            int temp = scan.nextInt();
            if (max < temp) {
                max = temp;
            }
        }
        System.out.println("Maximum : " + max);
        scan.close();
    }
}
