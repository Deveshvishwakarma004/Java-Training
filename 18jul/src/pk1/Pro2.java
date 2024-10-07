package pk1;
import entities.Student;
import entities.Faculty;
import entities.Person;
public class Pro2 {

	public static void main(String[] args) {
//       Person p1 = new Student();   // Up Casting	is allowed in java
      Student s1 = new Student();
      Faculty f1 = new Faculty();
      
//      execute(s1);
      
      // Array of Objects
      Person arr[] = new Person[3];
      arr[0] = new Faculty();
      arr[1] = new Student();
      arr[2] = new Student();
      
      for(Person p : arr) {
    	  p.show();
    	  p.canVote();
    	  
    	  if(p instanceof Student) 
    	  {   // Used to remove run-time error
    	      Student s = (Student)p;
    	      s.giveExam();   
          }
      }
      
}
      
      private static void execute(Person ob) 
      // We have taken Person reference so that we can use Student as well as Faculty in our function
      {
    	  ob.input();
    	  ob.show();
    	  ob.canVote();
      }
	

}
