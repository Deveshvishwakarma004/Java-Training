package pk1;

public class Pro2 {

	public static void main(String[] args) {
		Integer x = new Integer(58);
		Integer y = new Integer(12);
		
//		Integer z = x+y;
//		Integer z = new Integer(x.intValue() + y.intValue());
		//Boxing and UnBoxing for older versions of Java
		
		int z = x+y;
		System.out.println(z);

	}

}
