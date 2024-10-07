package Package2;

public class Pro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Annonymous object
//		new Student().show();
		
		Student studs[] = new Student[2];
		
		for(int i = 0 ; i<studs.length ; i++) 
		{
			studs[i] = new Student();
			studs[i].input();
		}
		for(Student s : studs)
		{
		  s.show();	
		}
	}

}
