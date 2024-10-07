package expection_handling;

import java.io.IOException;

public class Pro4 {

	public static void main(String[] args) {
		/*
		 Types of Exception in java
		 1: Checked    --> Exception handling is mandatory
		 2: Unchecked  --> Exception handling is not mandatory
		 */
		try 
		{
         System.in.read();
	    }catch (Exception e) {
	}
		Demo d = new Demo();
		try {
			d.fun1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
class Demo{
	public void fun1() throws IOException{
		System.in.read();
	}
}
