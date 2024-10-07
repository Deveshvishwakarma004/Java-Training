package pk1;

public class Pro2 {

	public static void main(String[] args) {
		// String methods
		String str = "Hello my name is Devesh";
		char c = str.charAt(2);
		System.out.println(c);
		
		System.out.println(str.length());
		String s1 = str.concat("...Good morning");
		System.out.println(s1);
		
		boolean b = str.contains("Devesh");
		System.out.println(b);
		
		str.endsWith("esh");
		str.startsWith("nam");
		
		System.out.println(str.getBytes());
		
		int i = str.indexOf("name");
		System.out.println(i);
		
		System.out.println(str.lastIndexOf("e"));
		
		String s2 = str.substring(6);
		System.out.println(s2);
		String s3 = str.substring(3, 10);
		System.out.println(s3);
		

	}

}
