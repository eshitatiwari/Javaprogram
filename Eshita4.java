import java.util.*;
class IPL_Team           //this program is working fine in bluej but not in window terminal
{
String team_name;
String wicketkeeper;
String allrounder;
String Captain;
IPL_Team()
{
//default constructor
}
IPL_Team(String team_name,String wicketkeeper,String allrounder,String Captain)// parameterized constructor
{
this.team_name=team_name;
this.wicketkeeper=wicketkeeper;
this.allrounder=allrounder;
this.Captain=Captain;
}
private class Player //private nested class
{
String player_name;
int price;
Player(String player_name,int price) // parameterized constructor
{
this.player_name=player_name;
this.price=price;
}
}
Player obj=new Player(" Dhoni",50000); //object of nested class
Player obj1=new Player("Ashwin",32000);
Player obj2=new Player("virat",10000);
void display() //display
{
System.out.println(team_name+"\t"+wicketkeeper+"\t"+allrounder+"\t"+Captain);
}
int find() //to find maximum price
{
if(obj.price>=obj1.price && obj.price>=obj2.price)
return 1;
else if(obj1.price>=obj.price && obj1.price>=obj2.price)
return 2;
else
return 3;
}}
class main
{
public static void main(String...args)
{
ArrayList list=new ArrayList(); //array list
IPL_Team obj=new IPL_Team("Chennai Super Kings"," Mohit Sharma"," Raina","Dhoni");
IPL_Team obj1=new IPL_Team("Mumbai Indian"," Dinesh Karthik"," Trent boult","Ashwin");
IPL_Team obj2=new IPL_Team("Royal Challengers Bangalore"," KL Rahul"," Kuldeep yadav","virat");
list.add(obj); // adding all the object
list.add(obj1);
list.add(obj2);
IPL_Team ob=new IPL_Team();//ob
int c=ob.find();
if(c==1)
obj.display();
else if(c==2)
obj1.display();
else
obj2.display();
}
}
