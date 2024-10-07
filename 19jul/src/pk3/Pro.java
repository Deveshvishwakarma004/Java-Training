package pk3;

public class Pro {

	public static void main(String[] args) {
		// Anonymous inner class
		ABC ob = new ABC()
		{
			@Override
			public void hello() {
				System.out.println("Hello All with Anonymous inner class");
			};
		};
		
		ob.hello();
		ob.fun();

	}

}
