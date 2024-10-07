package pk1;

public class Department {
     private String name;
     private String location;
     public Department(String name , String location) 
     {
    	 this.name = name;
    	 this.location = location;
     }
     public void showDep() 
     {
    	 System.out.println("Department Name : " +this.name);
    	 System.out.println("Department Location : " +this.location);
     }
}
