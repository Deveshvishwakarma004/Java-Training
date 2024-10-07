package Package3;
import java.util.Scanner;
public class Pro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student s1 = new Student(10 , 87.5f , "Devesh");
      Student s2 = new Student(11 , 83.6f , "Aditya");
      Student s3 = new Student(12 , 81.0f , "Krishna");
      Student s4 = new Student(13 , 82.9f , "Hemant");
      Student s5 = new Student(14 , 84.2f , "Raj");
      
      Student arr[] = {s1,s2,s3,s4,s5};
      
      int roll;
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter Roll no. : ");
      roll = sc.nextInt();
      
      for(Student s : arr) {
    	  if(roll == s.getRoll()) {
    		  s.show();
    	  }
      }
	}

}
