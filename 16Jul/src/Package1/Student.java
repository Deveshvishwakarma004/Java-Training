package Package1;
import java.util.Scanner;
public class Student 
{
  // Features	
  private int roll;
  private String name;
  private float marks;
  
  //Methods
  public void input() {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("\nEnter the Roll no. : ");
	  roll = sc.nextInt();
	  System.out.println("\nEnter the Name : ");
	  name = sc.next();
	  System.out.println("\nEnter the Marks : ");
	  marks = sc.nextFloat();
  }
  public void show() 
  {
	  System.out.println("\nRoll no. : " +roll);
	  System.out.println("\nName : " +name);
	  System.out.println("\nMarks : " +marks);
  }
  
}
