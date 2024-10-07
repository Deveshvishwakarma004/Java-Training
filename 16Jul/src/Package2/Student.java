package Package2;

import java.util.Iterator;
import java.util.Scanner;
public class Student 
{
  // Features	
  private int roll;
  private String name;
  private float marks[];  // Array Declaration
  
  //Constructor
  public Student() 
  {
	  this.marks = new float[5];
  }
  //Methods
  public void input() {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("\nEnter the Roll no. : ");
	  this.roll = sc.nextInt();
	  System.out.println("\nEnter the Name : ");
	  this.name = sc.next();
	  System.out.println("\nEnter the Marks of 5 subjects : ");
//	  this.marks = sc.nextFloat();
	  for(int i = 0 ; i<this.marks.length ; i++) {
		  this.marks[i] = sc.nextFloat();
	  }
  }
  public void show() 
  {
	  System.out.println("\nRoll no. : " +this.roll);
	  System.out.println("\nName : " +this.name);
//	  for(int i = 0 ; i<5 ; i++) {   // For Each can also be used here
//		  System.out.print(this.marks[i] + " ");
//	  }
	  for(float x : this.marks) {     // ForEach loop
		  System.out.print(x + "  ");
	  }
	  
      System.out.println("\n");
  }
  
}
