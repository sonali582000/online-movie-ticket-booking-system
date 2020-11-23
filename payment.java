package mypack;
import java.util.*;

public class payment{
int balance=5000;
int withdrawal; 
public void pay()
{
System.out.println("*****Enter Payment details*****") ;
Scanner sc=new Scanner(System.in);
System.out.println("Enter withdrawal Amount=");
this.withdrawal=sc.nextInt();
try
{
if (this.balance<this.withdrawal)
throw new ArithmeticException("Insufficient balance");
balance=balance-withdrawal;
System.out.println("Transaction Successfully completed");}
catch(ArithmeticException e){
System.out.println("Exception:"+e.getMessage());}
System.out.println("Program continue..");
}

public static void main(String args[]){
payment p1=new payment();
p1.pay();
}
}
