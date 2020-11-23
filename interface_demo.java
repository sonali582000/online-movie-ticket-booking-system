import mypack.*;
import mypack.payment;
import java.util.*;
import java.math.BigInteger;

interface details{
void menu();
}

class Admin implements details{
public void menu(){
System.out.println("*****Movie******");
System.out.println("The movies available are");
System.out.println(" [1]Mrs. Serial Killer -------- Rs.180 \n 2.Bulbbul - Rs.180 \n 3.Shakuntala Devi ---- Rs.160 \n 4.Gunjun Saxena ----- Rs.160 ");     }
public void adminlogin(){
Scanner input = new Scanner(System.in);
String u="Admin";
String p="Admin123";
String username;
String password;
System.out.println("*****Log in******");
System.out.print("Enter Username :: ");
username = input.next();
System.out.print("Enter Password :: ");
password = input.next();
if(username.equals(u) && password.equals(p)) 
System.out.println("You are logged in");
else
System.out.println("Invalid Username/Password");
}}

class User implements details{
public void menu(){
System.out.println("*****Movie******");
System.out.println("the movies available are");
System.out.println(" [1]Mrs. Serial Killer -------- Rs.180 \n 2.Bulbbul - Rs.180 \n 3.Shakuntala Devi ---- Rs.160 \n 4.Gunjun Saxena ----- Rs.160 ");     }
String full_name; 
BigInteger phone_no; 
String email_Id; 
String user_name;
String password;
public void registration(){
System.out.print("\n*************Enter Registration details*************\n");
Scanner sc=new Scanner(System.in);
System.out.print("Enter Full name=");
this.full_name=sc.next();
System.out.print("Enter Phone No=");
this.phone_no=sc.nextBigInteger();
System.out.print("Enter Email_id=");
this.email_Id=sc.next();
System.out.print("Enter UserName=");
this.user_name=sc.next();
System.out.print("Enter Password=");
this.password=sc.next();
}
public void userlogin(){
Scanner input = new Scanner(System.in);
String username;
String password;
System.out.println("*****Log in******");
System.out.print("Enter Username :: ");
username = input.next();
System.out.print("Enter Password :: ");
password = input.next();
if ( (user_name.equals(username)) && (password.equals(password)) )
System.out.println("Verified");
else
System.out.println("Invalid Username/Password");
}}
public class interface_demo{
public static void main(String args[])
{
System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("@		WELCOME		@");
System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("[1]    Display Latest Released Movie ");
System.out.println("[2]    Admin Login");
System.out.println("[3]    User Login");
System.out.println("[4]    Payment");
System.out.println("[5]    Log out");
int choice;
do {
System.out.println("Enter the option: ");
Scanner scan = new Scanner(System.in);
choice = scan.nextInt();
switch (choice)
{
case 1:
details d1=new Admin();
d1.menu();
break;
case 2:
Admin a1=new Admin();
a1.adminlogin();
break;
case 3:
User u1=new User();
u1.registration();
u1.userlogin();
Mymovies ob = new Mymovies();
Mymovies[] moviename = new Mymovies[2];
moviename[0] = ob;
theater a = new theater();
moviename[1] = a;
System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
System.out.println("---------1.List of movies and their prices--------- \n-------2.Access and book tickets through theaters---\n---------------------Logout-----------------");
System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
int h;
do {
System.out.println("Enter the option: ");
Scanner d = new Scanner(System.in);
h = d.nextInt();
switch (h) {
case 1: 
ob.movies();
break;
case 2:     
a.thea();
break;
case 3:
break;
}
}while(h !=3);

break;
case 4:
payment p1=new payment();
p1.pay();

case 5:
break;
}
}while(choice !=5);
}
}