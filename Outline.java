Protected class Role
{
   int Role_Id;
   String Role_name;
}

class Admin extends Role 
{ 
    int Id; 
    String full_name; 
    String phone_no; 
    String email_Id; 
    String gender; 
    String user_name;
    String password;

    public void login()
    {
       if (role_id==Id)
	{
	     system.out.println("Welcome to Admin Page Mr"+full_name);
     	}  
       else
	{
	   system.put.println("Error");
	}
}

class User extends Role 
{   
    int userId; 
    String full_name; 
    String dob; 
    String phone_no; 
    String email_Id; 
    String gender; 
    String user_name;
    String password;

    public void registration(){} //user_name,dob,username,password....
    public void login(){}  // username,password
} 
  
  
public class Multiplex 
{   
    int multiplex_Id; 
    String multiplex_Name; 
    String city; 
    String pinCode; 
    String state; 
    String streetNo; 
    String address; 
    int pin_code;
  
    public void movie_list(){}
    public float rating(){return 0;}
} 

public class Movie extends Multiplex
{ 
    int movieId; 
    String movie_details;

    public void Movie(){}//Bollywood,Hollywood
} 

public class Seat_type extends Movie
{
   int seat_id;
   String[] seat_type_name = {"Gold=₹150","Silver=₹115","Platinum=₹100"};
}

public class Time_slot extends Seat_type
{
   int time_id;
   String[] time_slot={"10:00AM-01:30PM","04:00PM-06:00PM"};
}

public class Screen extends Time_slot
{
   int screen_id;
}
  
public class Booking extends Screen
{ 
    int bookingId; 
    int amount; 
    String time_slot;
    int booked_date;  
} 
  

public class payment extends Booking
{
   int pay_id;
   String payment_status;
   
  void payment_via(){}
}

private class Transaction extends payment
{
   int transaction_id; 
   float price;
}