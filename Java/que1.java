import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class que1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x/y);
        } catch(java.util.InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch(Exception e) {
            System.out.println(e);
        }
        
    }
}