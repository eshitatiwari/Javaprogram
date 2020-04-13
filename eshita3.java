import java.util.*; 
import java.io.*; 
import java.util.Scanner;
interface UGC 
{ int registrationno=118102; //predefined registration number
String payFee();
static int getAdmission(){
return registrationno;
}

}
interface AICTE
{ int tokenno=0001;
String payFee();
static int getAdmission()
{
return tokenno;
}


}
class university implements UGC,AICTE //inheritance
{

String fee_due;
static double percentage;
static int getAdmission() //overriding
{
Scanner input=new Scanner(System.in);
System.out.print("Enter your Percentage: ");
percentage=input.nextDouble();
if(percentage>=60) //For addmission in UGC
{
UGC obj1=new university();
System.out.println("Congratulation your Admission is Successfull!");
System.out.println("Your Registration number is: "+obj1.registrationno);
}
else{         //for addmission in AICTE
AICTE obj=new university();
System.out.println("\nPlease join the counseling after 5 days");
System.out.println("Counseling date:11/01/2021 ");
System.out.println("\nYour counseling token number is: "+obj.tokenno);
}
return 0;
}
public String payFee()
{
if(percentage>=60) // for UGC
{
fee_due="25000";
return fee_due;
}
else{ //for AICTE
fee_due="34000";
return  fee_due;
}
}
}
class LPU extends university
{
static int getAdmission()
{
university x=new university();
x.getAdmission(); //function calling
return 0;
}
public String payFee()
{
Scanner input=new Scanner(System.in);
int printx=12008;
printx++;
int paid;
int dueamt;
university obj=new university();
dueamt=Integer.parseInt(obj.payFee()); //changing returned string to integer
System.out.println("\nYour fee due is :"+dueamt);
System.out.println("Please enter your fee");
paid=input.nextInt();
if(paid<=dueamt){
System.out.println("Fee paid Successfully RECEIPT number: " +printx);
System.out.print("\nDue amount: " + (dueamt-paid));
}
else
{
System.out.println("Please enter amount less the Due amount that is: "+dueamt );
}

return "null";
}
public static void main(String...args)
{
LPU objx=new LPU();
objx.getAdmission();
objx.payFee();
}
}