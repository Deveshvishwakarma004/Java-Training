package entities;

public class Faculty extends Person {
  private int facid;
  private float salary;
  public Faculty() {
	super();
	
}
  public Faculty(String name, int age, String phone , int facid , float salary) {
	super(name, age, phone);
	this.facid = facid;
	this.salary = salary;
}
  @Override
	public void show() {
		super.show();
		System.out.println("\nFaculty ID : " +this.facid);
		System.out.println("\nSalary : " +this.salary);
	}
  
}
