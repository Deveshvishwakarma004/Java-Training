package entities;
import java.util.*;
public class Student extends Person {
     private int roll;
     private float marks;
     
     public Student() {
    	 super();
     }

	public Student(String name, int age, String phone, int roll, float marks) {
		super(name, age, phone);
		this.roll = roll;
		this.marks = marks;
	}
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the Roll No. : ");
		this.roll = sc.nextInt();
		System.out.println("\nEnter the Marks : ");
		this.marks = sc.nextFloat();
	}
    @Override
    public void show() {
    	// TODO Auto-generated method stub
    	super.show();
    	System.out.println("\nRoll No. : "+this.roll );
    	System.out.println("\nMarks : "+this.marks);
    }
    public void giveExam() {
    	System.out.println("\n Sample method of Student class");
    }
}
