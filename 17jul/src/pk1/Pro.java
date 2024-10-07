package pk1;

public class Pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Department dep1 = new Department("Sales", "Indore");
     Department dep2 = new Department("Accounts", "Bhopal");
     Department dep3 = new Department("Finance", "Ujjain");
     
     Employee o1 = new Employee("Devesh" , 21 , dep1 , 95000.00f);
     Employee o2 = new Employee("Divyanshi" , 20 , dep2 , 85000.00f);
     Employee o3 = new Employee("Krishna" , 22 , dep3 , 65000.00f);
     o1.show();
     o2.show();
     o3.show();
	}

}
