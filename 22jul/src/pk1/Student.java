package pk1;
import java.util.*;
public class Student implements Comparable<Student> {
	private int roll;
	private String name;
	private float marks;
	public Student(int roll, String name, float marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	public void show()
	{
		System.out.println("\nRoll : " +this.roll);
		System.out.println("\nName : " +this.name);
		System.out.println("\nMarks : " +this.marks);
	}
	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		return this.roll == s.roll;
				
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return (int)(this.roll-o.roll);
	}
}
