package expection_handling;

public class Pro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"455"};
		
		try 
		{
		int x = Integer.parseInt(arr[0]);   //Wrapper class Integer
		int y = Integer.parseInt(arr[1]);
		
		int z = x+y;
		System.out.println(z);
		
		} 
		catch (Exception e) {
			System.err.println("Error : "+e);
			
		}
		finally {
			System.out.println("Finnally running");
		}
		// Finally runs whether the exception is handled or not
		
		System.out.println("Thank you");

	}

}
