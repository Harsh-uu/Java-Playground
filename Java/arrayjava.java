import java.util.Scanner;
class arrayjava{
    public static void main(String args[]){
        // int a[] = {1,2,3,4,5};
        int a[] = new int [5];
        System.out.println("Enter the elements of array");
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements:");
        for (int b : a){
            System.out.println(b+" ");
        }
    }
}