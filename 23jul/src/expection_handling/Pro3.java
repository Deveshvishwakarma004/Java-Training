package expection_handling;
import java.util.*;
public class Pro3 {

	public static void main(String[] args) {
	  @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter integer value: ");
     int x = sc.nextInt();
     try {
    	 if(x > 25) {
    	 System.out.println(x);
     }
     }catch(Exception e) {
    	 throw e;
     }
	}

}
