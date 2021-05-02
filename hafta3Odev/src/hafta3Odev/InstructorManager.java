package hafta3Odev;

public class InstructorManager extends UserManager{
	
	public void getList(Instructor[] instructors) 
	{
		for(Instructor instructor: instructors)
		{
			System.out.println("Eðitmen : "+" "+instructor.getFirstName()+" "+instructor.getLastName()+" " +instructor.email+" "+" eklendi!");
		}
	
		
		
	}
	

}
