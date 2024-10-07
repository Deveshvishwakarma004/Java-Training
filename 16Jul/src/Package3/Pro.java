package Package3;

public class Pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student ob1 = new Student(58 , 85.8f , "Devesh");
        ob1.show();
        Student ob2 = new Student();    //Constructor Overloading
//        ob2.input();
        ob2.show();
        Student ob3 = new Student(ob1);
        ob3.show();
        
        System.out.println("Hash Code of ob1 : "+ob1.hashCode());
        System.out.println("Hash Code of ob2 : "+ob2.hashCode());
        System.out.println("Hash Code of ob3 : "+ob3.hashCode());
	}

}
