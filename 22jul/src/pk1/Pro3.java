package pk1;
import java.util.*;
public class Pro3 {

	public static void main(String[] args) {
		// TreeSet needs comparable class
		TreeSet<Student> t = new TreeSet<>();
		t.add(new Student(58, "Devesh", 97.8f));
		t.add(new Student(39, "Aryan", 91.9f));
		t.add(new Student(42, "Krishna", 93.4f));
		
//		t.forEach(o->System.out.println(o));
		System.out.println(t);

	}

}
