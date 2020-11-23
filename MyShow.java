package mypack;
import java.util.Scanner;

class Mymovies{
private String move_name;
private String thetre_name;
private int cost;
void movies() {     
System.out.println("The movies available are");
System.out.println(" [1]Mrs. Serial Killer -------- Rs.180 \n [2]Bulbbul - Rs.180 \n [3]Shakuntala Devi ---- Rs.160 \n [4]Gunjun Saxena ----- Rs.160 ");    }
}

class theater extends Mymovies{
private int no_f_tickets;
void thea() {
System.out.println("*******The theaters available are******* \n 1.Jumbo Theater \n 2.Astha Theater");
int k;
int an;
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if (n == 1) {
System.out.println("******* Jumbo Theater*******");
System.out.println("*******Select a movie*******");
System.out.println("Movie available are \n [1]Mrs. Serial Killer  \n [2]Bulbbul  ");
Scanner a = new Scanner(System.in);
int option = a.nextInt();
if (option == 1) {
System.out.println("Mrs. Serial Killer @   Jumbo Theater");
System.out.println("Enter the number of tickets to be booked");
Scanner j = new Scanner(System.in);
int r = j.nextInt();
int left= no_f_tickets-r;
int amount=180*r;
System.out.println("to continue to book for this movie press 1");
Scanner d = new Scanner(System.in);
int h = d.nextInt();
System.out.println("\n\n\n");
if (h == 1) {
System.out.println("******************************************************");
System.out.println("Theater -------------------  Jumbo Theater");
System.out.println("Movie --------------------- Mrs. Serial Killer");
System.out.println("Cost ---------------------- Rs."+amount);
System.out.println("******************************************************");}}
if (option == 2) {
System.out.println("Bulbbul @ Jumbo Theater");
System.out.println("Enter the number of tickets to be booked");
Scanner j = new Scanner(System.in);
int r = j.nextInt();
int left= no_f_tickets-r;
int amount=180*r;
System.out.println("to continue to book for this movie prees 1");
Scanner d = new Scanner(System.in);
int h = d.nextInt();
System.out.println("\n\n\n");
if (h == 1) {
System.out.println("******************************************************");
System.out.println("Theater ------------------- Jumbo Theater");
System.out.println("Movie --------------------- Bulbbul");
System.out.println("Cost ---------------------- Rs"+amount);
System.out.println("******************************************************");}}
}
if (n == 2) {
System.out.println("*******Astha Theater*******");
System.out.println("*******Select a movie*******");
System.out.println("Movie available are \n [1]Shakuntala Devi \n [2]Gunjun Saxena");
Scanner b = new Scanner(System.in);
int p = b.nextInt();
Scanner a = new Scanner(System.in);
int o = a.nextInt();
if (o == 1) {
System.out.println("Shakuntala Devi @ Astha Theater");
System.out.println("Enter the number of tickets to be booked");
Scanner j = new Scanner(System.in);
int r = j.nextInt();
int left= no_f_tickets-r;
int amount=160*r;
System.out.println("to continue to book for this movie prees 1");
Scanner d = new Scanner(System.in);
int h = d.nextInt();
System.out.println("\n\n\n");
if (h == 1) {
System.out.println("******************************************************");
System.out.println("Theater ------------------- Astha Theater");
System.out.println("Movie --------------------- Shakuntala Devi");
System.out.println("Cost ---------------------- Rs."+amount);
System.out.println("******************************************************");}
}
if (o == 2) {
System.out.println("Gunjun Saxena @Astha Theater");
System.out.println("Enter the number of tickets to be booked");
Scanner j = new Scanner(System.in);
int r = j.nextInt();
int left= no_f_tickets-r;
int amount=160*r;
System.out.println("to continue to book for this movie prees 1");
Scanner d = new Scanner(System.in);
int h = d.nextInt();
System.out.println("\n\n\n");
if (h == 1) {
System.out.println("******************************************************");
System.out.println("Theater ------------------- Astha Theater");
System.out.println("Movie --------------------- Gunjun Saxena");
System.out.println("Cost ---------------------- Rs."+amount);
System.out.println("******************************************************");}
}}}
}
public class MyShow{
public static void main(String[] args) {
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
}}