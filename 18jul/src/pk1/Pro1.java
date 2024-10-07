package pk1;

//import entities.Person;
import entities.Student;
//import entities.Faculty;

public class Pro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Person p1 = new Person("Devesh" , 21 , "9111799734");
//		Student s1 = new Student("Devesh" , 21 , "9111799734" , 58 , 95.04f);
//		Faculty f1 = new Faculty("Devesh" , 21 , "9111799734" , 5 , 96000.00f);
		
		Student s1 = new Student();
		s1.input();
        s1.show();
        s1.canVote();
	}

}
