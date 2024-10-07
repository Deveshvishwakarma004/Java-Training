package pk1;

public class Pro1 {

	public static void main(String[] args) {
		// Mutable and Immutable objects

		// Immutable class
//		String is immutable in Java
		String str1 = "Good Morning";
		System.out.println(str1);
		System.out.println(str1.hashCode());
		str1 = "Hello world";
// New object is created when assigning new values to string object which is immutable
		System.out.println(str1);
		System.out.println(str1.hashCode());
// For same values String does not assign distinct objects to it
		String s1 = "Indore";
		String s2 = "Indore";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
//But when to value is changed it assign new object to it
		s2 = "Dewas";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
