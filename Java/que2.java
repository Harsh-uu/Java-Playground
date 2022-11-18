import java.util.Scanner;

public class que2{
public static void main(String args[])
{
double tax=0,it;
Scanner sc=new Scanner(System.in);
System.out.println("Enter income :");
it=sc.nextDouble();
if(it<=50000)
 tax=0;

else if(it<=60000)
 tax=0.1*(it-50000);

else if(it<=150000)
 tax=(0.2*(it-60000))+(0.1*100000);

 else
 tax=(0.3*(it-150000))+(0.2*90000)+(0.1*10000);

System.out.println("Income tax amount is "+tax+" Rs.");
}
}


