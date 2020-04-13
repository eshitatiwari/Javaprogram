import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
class Laptop
{

int [] price=new int[50]; //declaring varible with most capacity of 50
int[] model_number=new int[50];;
int [] ram=new int[50];

void getdata(int n){              //function to get input
int no=n;
for(int i=0;i<no;i++)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the Ram");
ram[i]=input.nextInt();
System.out.println("Enter the model");
model_number[i]=input.nextInt();
System.out.println("Enter the Price");
price[i]=input.nextInt();
}
}
void sortbyram(int a) //sorting the all information according to ram
{
int len=a;
int x;
int y;
int z;
for (int i = 1; i <len; i++) {            //using insertion sort
for (int j = i; j > 0; j--) {
if (ram[j] > ram [j - 1]) {
x = ram[j];
ram[j] = ram[j - 1];
ram[j - 1] = x;
y = price[j];
price[j] = price[j - 1];
price[j - 1] = y;
z= model_number[j];
model_number[j] = model_number[j - 1];
model_number[j - 1] = z;
}
}
}
for(int i=0;i<len;i++)  // displaying sorted information
{
System.out.println("Model Number: "+model_number[i]);
System.out.println("Price: "+price[i]);
System.out.println("RAM: "+ram[i]);
}
}
void sortbyprice(int a) //sorting the all information according to price
{
int len=a;
int x;
int y;
int z;
for (int i = 1; i < len; i++) { //using insertion sort
for (int j = i; j > 0; j--) {
if (price[j] < price [j - 1]) {
x = ram[j];
ram[j] = ram[j - 1];
ram[j - 1] = x;
y = price[j];
price[j] = price[j - 1];
price[j - 1] = y;
z= model_number[j];
model_number[j] = model_number[j - 1];
model_number[j - 1] = z;
}
}
}
for(int i=0;i<len;i++)  // displaying sorted information
{
System.out.println("Model Number: "+model_number[i]);
System.out.println("Price: "+price[i]);
System.out.println("RAM: "+ram[i]);
}
}
void model(int x,int a)
{
int m=a;
int key=x;
int [] digit=new int[50];
for(int i=0;i<m;i++)
{
digit[i]=model_number[i];
while(digit[i]>0)
{
if(digit[i]%10==key) //getting one digit remainder and caompring it with the key
{
System.out.println("Model Number: "+model_number[i]);
System.out.println("Price: "+price[i]);
System.out.println("RAM: "+ram[i]);
break;
}
digit[i]=digit[i]/10;
}
}
}
}
class main
{
public static void main(String...args)
{
Laptop obj=new Laptop();
int no;
Scanner input=new Scanner(System.in);
System.out.println("Enter how many laptop information you want to feed:");
no=input.nextInt();
obj.getdata(no);
System.out.println("1:ram 2:price 3:model");//menu driven program
int c=input.nextInt();       
switch(c){          
case 1:
obj.sortbyram(no);
break;
case 2:
obj.sortbyprice(no);
break;
case 3:
int k;
System.out.println("Please eneter 1 digit key to search");
k=input.nextInt();
obj.model(k,no);
break;
default:
System.out.println("Enter valid entry");
break;
}
}
}