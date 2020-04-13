import java.util.*;
import java.util.Scanner;
import java.lang.*;
class TicketBooking
{
private String stageEvent; //private variale
private String  customer;
private int noofSeats;
TicketBooking() //default constructor
{
stageEvent="";
customer="";
noofSeats=0;
}
TicketBooking(String stageEvent,String  customer,int noofSeats) //paramterzied constructor
{
this.stageEvent=stageEvent;
this.customer=customer;
this.noofSeats=noofSeats;
}
public String dummy() //getter
{
return stageEvent;
}
public String dummy1() //getter
{
return customer;
}
public int dummy2() //getter
{
return noofSeats;
}
public void makePayment(double amount) //cash method overloading
{
double amt=amount;
System.out.println("\nStage Event: "+stageEvent); //display information
System.out.println("Customer: "+customer);
System.out.println("Number of seats: "+noofSeats);
System.out.println("Amount paid Rs."+amt+" in cash");
}
public void makePayment(String walletNumber ,double amount) // wallet method overloading
{
double amt=amount;
String wn=walletNumber; 
System.out.println("\nStage Event: "+stageEvent);  //display information
System.out.println("Customer: "+customer);
System.out.println("Number of seats: "+noofSeats);
System.out.println("Amount paid Rs."+amt+" using wallet number: "+wn);
}
public void makePayment(String creditCard,String ccv,String name,double amount)	//credit card method
{                                                                           //overloading
double amt=amount;
String card=creditCard;
String CCV=ccv;
String nm=name;
System.out.println("\nStage Event: "+stageEvent); //display information
System.out.println("Customer: "+customer);
System.out.println("Number of seats: "+noofSeats);
System.out.println("Holder name:"+nm);
System.out.println("Amount paid Rs."+amt+" using "+card+"and CCV:"+CCV);
}
}
class main
{
public static void main(String...args)
{
Scanner input=new Scanner(System.in);
Scanner dis=new Scanner(System.in);
String stageEvent;
String  customer;
String inputall;
int noofSeats;
String[] line;
System.out.println("\nPlease enter the deatails Separated by , ");
System.out.println("STAGE EVENT , CUSTOMER , NUMBER OF SEATS");
inputall = dis.nextLine(); //cvv format input
line = inputall.split(",");
stageEvent=line[0];
customer=line[1];
noofSeats=Integer.parseInt(line[2]); //changing string to int
TicketBooking obj=new TicketBooking(stageEvent,customer,noofSeats);
int ch;
System.out.println("Payment Mode:");
System.out.println("1.Cash payment");
System.out.println("2.Wallet payment");
System.out.println("3.Credit card payment");
ch=input.nextInt();
switch(ch)    //menu driven
{
case 1:
double amount1;
System.out.println("Please enter the amount: ");
amount1=input.nextDouble();
obj.makePayment(amount1);
break;
case 2:
double amount2;
System.out.println("Please enter the amount: ");
amount2=input.nextDouble();
String walletNumber;
System.out.println("Please enter the your walletNumber: ");
walletNumber=dis.nextLine();
obj.makePayment(walletNumber,amount2);
break;
case 3:
String creditCard;
String ccv;
String name;
double amount3;
System.out.println("Please enter the your card holder name: ");
name=dis.nextLine();
System.out.println("Please enter the amount: ");
amount3=input.nextDouble();
System.out.println("Please enter the credit card type: ");
creditCard=dis.nextLine();
System.out.println("Please enter the CCV number: ");
ccv=dis.nextLine();
obj.makePayment(creditCard,ccv,name,amount3);
break;
default:
System.out.println(" Please Enter valid Option");
break;
}
}
}




























