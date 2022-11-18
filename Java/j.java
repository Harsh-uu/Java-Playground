import java.io.*;
import java.util.*;
public class j{
    public static void main(String[] args)
    {
        try{
            int value =50/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("Remaining code");
        }
    }
}