import java.util.Scanner;
class Student
{
Scanner scan= new Scanner(System.in);

void accept_stu()
{
System.out.println("Enter first name");
String f=scan.nextLine();
System.out.println("Enter last name");
String l=scan.nextLine();
System.out.println("Enter qualification");
String q=scan.nextLine();
System.out.println("Enter percentage");
float p=scan.nextFloat();
System.out.println("Enter total marks");
int t=scan.nextInt();
}

void display_stu()
{
System.out.println("The First name is:" +f);
System.out.println("The Last name is:" +l);
System.out.println("The Qualification is:" +q);
System.out.println("The Percentage is:" +p);
System.out.println("The Total marks are:" +t);
}
}

class Mca{
Scanner scan= new Scanner(System.in); 

void accept_stu()
{
System.out.println("Enter first name");
String f=scan.nextLine();
System.out.println("Enter last name");
String l=scan.nextLine();
System.out.println("Enter qualification");
String q=scan.nextLine();
System.out.println("Enter percentage");
float p=scan.nextFloat();
System.out.println("Enter total marks");
int t=scan.nextInt();
}

void display_stu()
{
System.out.println("The First name is:" +f);
System.out.println("The Last name is:" +l);
System.out.println("The Qualification is:" +q);
System.out.println("The Percentage is:" +p);
System.out.println("The Total marks are:" +t);
}
}
