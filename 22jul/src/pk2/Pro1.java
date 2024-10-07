package pk2;

//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.function.Consumer;
import java.util.*;

public class Pro1 {

	public static void main(String[] args) {
		// Array Implementation (Dynamic Array)
//		ArrayList<String> l1 = new ArrayList<>();
//		l1.add("Devesh");
//		l1.add("Hello");
//		l1.add("Hey");
//		l1.add("World");
		
		/* 
		 ArrayList : 
		   1: Indexing support
		   2: Insertion order manageable
		   3: Duplicate Values are allowed
		   
		 */
		
		
//		for(int i =0 ; i<l1.size() ; i++) {
//			System.out.println(l1.get(i));
//		}
		
//		for(String s : l1) {
//			System.out.println(s);
//		}
		
		/*
		l1.forEach(new Consumer<String>() 
		{
			@Override
			public void accept(String t) 
			{
				System.out.println(t);
				
			}
		});
		*/
//		
//		l1.forEach(t->System.out.println(t));   // Lambda expression
//		ArrayList <Object>l2 = new ArrayList<>();
//		l2.add(l1);
//		System.out.println(l1);
//		System.out.println(l2);
		
		LinkedList<String> l1 = new LinkedList<>();
		
		l1.add("Devesh");
		l1.add("Hello");
		l1.add("World");
		System.out.println(l1);
//		List<String> lst =l1;
//		Queue<String> q = l1;
//		Deque<String> dq =l1;
		

	}

}
