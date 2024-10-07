package expection_handling;

public class Pro2 {
	public static void main(String[] args) 
	{
         A a = new A();
         a.funA();
	}

}

class A
{
	public void funA() {
		B b = new B();
		b.funB();
	}
}
class B 
{
	public void funB() {
		try {
		int a = 45 / 0;
		System.out.println(a);
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
