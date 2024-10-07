package pk2;

import java.util.*;

public class Pro2 {

	public static void main(String[] args) {
		/*
		 * HashSet :
		       1: It does not allow duplicate values
		       2: No Indexing Support
		       3: No Insertion Order Manage
		       4: Similar to Array Implementation
		    
		 */
		HashSet<String> st = new HashSet<>();
		st.add("Devesh");
		st.add("Hello World");
		st.add("Hello Here");
		st.add("Devesh");
		st.add("World");
		st.add("Hello World");
		
		st.forEach(t->System.out.println(st));
		
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Devesh");
		ts.add("Hello World");
		ts.add("Hello Here");
		ts.add("Devesh");
		ts.add("World");
		ts.add("Hello World");
		
		System.out.println(ts);
		// It gives the sorted data

	}

}
