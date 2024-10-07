package entities;
import java.util.Scanner;
public class Person //Here if final is used , it prevents the class to perform inheriternce
{
  private String name;
  private int age;
  private String phone;
  // No mathematical operation is there for the phone number , therefore it is taken as String

   public Person(String name, int age, String phone) {
	super();
	this.name = name;
	this.age = age;
	this.phone = phone;
}
   public void input()
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("\nEnter the Name : ");
	   this.name = sc.next();
	   System.out.println("\nEnter the Age : ");
	   this.age = sc.nextInt();
	   System.out.println("\nEnter the Phone no. : ");
	   this.phone =sc.next();
	   
   }
   public Person() 
   {
	   super(); // Optional
   }
   public void show() {
	   System.out.println("\nName : " +this.name);
	   System.out.println("\nAge : " +this.age);
	   System.out.println("\nPhone : "+ this.phone);
   }
   public final void canVote() 
   // Final keyword is used to prevent this method from overriding
   {
	   if(this.age>=18) {
		   System.out.println("** You are Eligible to grant your vote **");
	   }
	   else {
		   System.out.println("** You are not Eligible for voting **");
	   }
   }
  
}
