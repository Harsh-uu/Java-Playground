import java.util.Scanner;
public class que6{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Enter the number of integers : ");
        num = scan.nextInt();
        int[] array = new int[num];
        for (int i = 0; i != num; i++) {
            System.out.print("Enter integer at index " + i + " : ");
            array[i] = scan.nextInt();
        }
        System.out.println("Prime numbers in array are : ");
        for (int i : array) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i);
            }
        }
        scan.close();
    }
}
