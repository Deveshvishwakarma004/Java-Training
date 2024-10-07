package pk3;

public class Pro2 {

	public static void main(String[] args) {
		Test t1 = new Test()
		{
          @Override
        public void fun1() {
        	// TODO Auto-generated method stub
        	  System.out.println("Anonymous inner class by Test Interface");
        }
	  };
	  t1.fun1();

}
}
