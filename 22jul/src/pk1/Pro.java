package pk1;

public class Pro {

	public static void main(String[] args) {
		Student s1 = new Student(58 , "Devesh" , 95.07f);
		Student s2 = new Student(58 , "Devesh" , 95.07f);
		s1.show();
//		System.out.println(s1.toString());
//		System.out.println(s1==s2);
		// Gives False as reference is different for objects
        System.out.println(s1.equals(s2));
        // It gives true after overriding of the equals method
	}

}
