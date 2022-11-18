import java.util.Scanner;
public class que4{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of integers : ");
        int num = scan.nextInt();
        int sum_even = 0, sum_odd = 0, num_even = 0;
        for (int i = 1; i <= num; i++) {
            System.out.print("Enter integer " + i + " : ");
            int temp = scan.nextInt();
            if (temp % 2 == 0) {
                sum_even += temp;
                num_even++;
            }
            else {
                sum_odd += temp;
            }
        }
        System.out.println("Sum of even number : " + sum_even);
        System.out.println("Average of even number : " + (float) sum_even / num_even);
        System.out.println("Sum of odd number : " + sum_odd);
        System.out.println("Average of odd number : " + (float) sum_odd / (num - num_even));
        scan.close();
    }
}