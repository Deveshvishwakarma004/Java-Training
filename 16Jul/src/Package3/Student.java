package Package3;

import java.util.Scanner;
public class Student 
{
  // Features	
  private int roll;
  private String name;
  private float marks;
  
  // Default Constructor
  public Student () {}
  // Parametrized Constructor
  public Student(int roll, float marks , String name) {
	  this.roll = roll;
	  this.name = name;
	  this.marks = marks;
  }
  public Student(Student s) {
	  this.roll = s.roll;
	  this.name = s.name;
	  this.marks = s.marks;
  }
  //Methods
  public int getRoll()
  {
	return this.roll;  
  }
  public void input() {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("\nEnter the Roll no. : ");
	  this.roll = sc.nextInt();
	  System.out.println("\nEnter the Name : ");
	  this.name = sc.next();
	  System.out.println("\nEnter the Marks : ");
	  this.marks = sc.nextFloat();
  }
  public void show() 
  {
	  System.out.println("\nRoll no. : " +this.roll);
	  System.out.println("\nName : " +this.name);
	  System.out.println("\nMarks : " +this.marks);
  }
  
}
