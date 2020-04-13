import java.util.*;
import java.util.Scanner;
class voter
{
String name;
String dateofbirth;
int age;
int id;
String status;
voter(String name, String dateofbirth,int age,int id,String status)
{
this.name=name;
this.dateofbirth=dateofbirth;
this.age=age;
this.status=status;
if(age>=18) // assign when voter id when age is more then or equal to 18
{
this.id=id;
}
}
class voter_card{
String votername;
int voterid;
voter_card(String votername,int voterid)
{
this.votername=votername;
this.voterid=voterid;
}}
void display()
{
voter_card obj=new voter_card(name,id); //object of nested class
System.out.println("\nName: "+ obj.votername);
System.out.println("Voter_ID: "+ obj.voterid);
System.out.println("Dateofbirth: "+ dateofbirth);
System.out.println("Age: "+age);
System.out.println("STATUS= "+status);
}
}
class main
{
public static void main(String...args)
{
Scanner input=new Scanner(System.in);
Scanner input1=new Scanner(System.in);
int no;
System.out.println("Enter number of voter id you want to create");
no=input.nextInt();
voter obj[]=new voter[no]; // creating n number of object
int id=1234;
for(int i=0;i<no;i++) //input
{
System.out.println("Enter your name");
String name=input1.nextLine();
System.out.println("Enter your Date of Birth");
String dob=input1.nextLine();
System.out.println("Enter your age");
int age=input.nextInt();
if(age>=18){
obj[i]=new voter(name,dob,age,++id,"CREATED SUCCESSFULLY");
}
else{
obj[i]=new voter(name,dob,age,0,"UNSUCCESSFULL");
}
}
for(int i=0;i<no;i++) //calling display function 
{
obj[i].display();
}
}
}





 
