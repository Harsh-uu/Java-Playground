import java.io.*;
import java.util.*;
interface printable
{
    void print();
}
class iface implements printable
{
    public void print()
    {
        System.out.println("This code is working!");
    }
public static void main(String args[])
{
    iface i1 = new iface();
    i1.print();
}
}