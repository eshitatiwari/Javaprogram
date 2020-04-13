import java.util.*; 
import java.io.*; 
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
class vehicle implements Serializable // implementing pre defined class in java
{
String name;
float mileage;
int price;
vehicle(String name, float mileage, int price) //parameterzied construtor
{
this.name=name;
this.mileage=mileage;
this.price=price;
}
public int getPrice() //function to return price
{
return price;
}
public static void main(String...args)
{
Scanner input=new Scanner(System.in);
Scanner input1=new Scanner(System.in);
Scanner input2=new Scanner(System.in);
String name1;
float mileage1;
int price1;
String name2;
float mileage2;
int price2;
String name3;
float mileage3;
int price3;
System.out.println("Enter the name , Milage and price of the first car"); //input
name1=input.nextLine();
mileage1=input.nextFloat();
price1=input.nextInt();
System.out.println("Enter the name , Milage and price of the second car");
name2=input1.nextLine();
mileage2=input1.nextFloat();
price2=input1.nextInt();
System.out.println("Enter the name , Milage and price of the third car");
name3=input2.nextLine();
mileage3=input2.nextFloat();
price3=input2.nextInt();
vehicle obj1=new vehicle(name1,mileage1,price1);
vehicle obj2=new vehicle(name2,mileage2,price2);
vehicle obj3=new vehicle(name3,mileage3,price3);
try{
FileOutputStream fos=new FileOutputStream("record.doc"); // feeding all the information in a file
ObjectOutputStream oos=new ObjectOutputStream(fos);
ObjectOutputStream oos1=new ObjectOutputStream(fos);
ObjectOutputStream oos2=new ObjectOutputStream(fos);
oos.writeObject(obj1);
oos1.writeObject(obj2);
oos2.writeObject(obj3);
oos.close();
oos1.close();
oos2.close();
fos.close();
}
catch(IOException e)
{
e.printStackTrace();
}
if(price1>price2 && price1>price3) //displaying price1 if it is highest
{
try{
FileOutputStream fos=new FileOutputStream("record.doc");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(obj1);
oos.close();
fos.close();
}
catch(IOException e)
{
e.printStackTrace();
}
try{
ObjectInputStream is=new ObjectInputStream(new FileInputStream("record.doc")); 
vehicle p=(vehicle) is.readObject();
System.out.println("Name = " + p.name + " Mileage = " + p.mileage + " Price= " + p.price);
is.close();
}
catch(FileNotFoundException e){
e.printStackTrace();
}
catch(IOException e){
e.printStackTrace();
}
catch(ClassNotFoundException e)
{
e.printStackTrace();
}

}
else if(price2>price1 && price1>price3) //displaying price2 if it is highest
{
try{
FileOutputStream fos=new FileOutputStream("record.doc");
ObjectOutputStream oos1=new ObjectOutputStream(fos);
oos1.writeObject(obj2);
oos1.close();
fos.close();
}
catch(IOException e)
{
e.printStackTrace();
}
try{
ObjectInputStream is=new ObjectInputStream(new FileInputStream("record.doc")); 
vehicle p=(vehicle) is.readObject();
System.out.println(" Name =" + p.name + " Mileage=" + p.mileage + " Price= " + p.price);
is.close();
}
catch(FileNotFoundException e){
e.printStackTrace();
}
catch(IOException e){
e.printStackTrace();
}
catch(ClassNotFoundException e)
{
e.printStackTrace();
}
}
else if(price3>price2 && price3>price1) //displaying pric if it is highest
{
try{
FileOutputStream fos=new FileOutputStream("record.doc");
ObjectOutputStream oos2=new ObjectOutputStream(fos);
oos2.writeObject(obj3);
oos2.close();
fos.close();
}
catch(IOException e)
{
e.printStackTrace();
}
try{
ObjectInputStream is=new ObjectInputStream(new FileInputStream("record.doc")); 
vehicle p=(vehicle) is.readObject();
System.out.println("Name =" + p.name + " Mileage= " + p.mileage + " Price= " + p.price);
is.close();
}
catch(FileNotFoundException e){
e.printStackTrace();
}
catch(IOException e){
e.printStackTrace();
}
catch(ClassNotFoundException e)
{
e.printStackTrace();
}
}
}}
