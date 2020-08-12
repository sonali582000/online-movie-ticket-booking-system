class Role
{
   int Role_Id;
   String Role_name;
}

class Admin extends Role 
{ 
    int Role_id;
    int Id; 
    String full_name; 
    String phone_no; 
    String email_Id; 
    String gender; 
    String user_name;
    String password;

    public void login(){}  // username,password
}

class User extends Role 
{   
    int Role_id;
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
  

  
class Multiplex { 
  
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

class Movie extends Multiplex
{ 
    int multiplex_Id;   
    int movieId; 
    String movie_details;
    public void Movie(){}//Bollywood,Hollywood
} 

class Seat_type
{
   int seat_id;
   String[] seat_type_name = {"Gold=₹150","Silver=₹115","Platinum=₹100"};
}

class Time_slot
{
   int time_id;
   String[] time_slot={"10:00AM-01:30PM","04:00PM-06:00PM"};
}

class Screen
{
   int screen_id;
   int seat_id;
   int time_id;
   int movie_id;
}
  
class Booking 
{ 
    int bookingId; 
    int userId; 
    int movie_id; 
    int screen_id;
    int amount; 
    String time_slot;
    int booked_date;  
} 
  

class payment
{
   int pay_id;
   String payment_status;
   
  void payment_via(){}
}

class Transaction
{
   int transaction_id;
   int bookingId;
   float price;
   int pay_id;
}