package pk1;

public class Employee {
   private String name;
   private Department dep;   // HAS-A Relationship
   private float salary;
   private int age;
   
   public Employee(String name , int age , Department dep , float salary) 
   {
	   super();
	   this.name= name;
	   this.age = age;
	   this.dep = dep;
	   this.salary = salary;
   }
   
   public void show()
   {
	System.out.println("Name : " +this.name);   
	System.out.println("Age : " +this.age); 
	System.out.println("Salary : " +this.salary); 
	this.dep.showDep();
   }
}
