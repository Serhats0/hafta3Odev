package hafta3Odev;

public class Main {

	public static void main(String[] args) {

		 Instructor instructor = new Instructor();
		 
	        instructor.setId(1);
	        instructor.setFirstName("Engin");
	        instructor.setLastName("Demiroğ");
	        instructor.setEmail("engindemirog@gmail.com");
	        instructor.setPassword("Engin_Dg.03@");
		
	        Instructor[] instructors = {instructor};
	        InstructorManager instructorManager=new InstructorManager();
	        instructorManager.getList(instructors);

			
	
	
		    Student student = new Student();
	        student.setId(2);
	        student.setFirstName("Ali");
	        student.setLastName("Akmak");
	        student.setEmail("alicakmak74@hotmail.com");
	        student.setPassword("ali1974");
	        
	        Student student2 = new Student();
	        student2.setId(2);
	        student2.setFirstName("Mustafa");
	        student2.setLastName("Cengiz");
	        student2.setEmail("cengizmustafa@protonmail.com");
	        student2.setPassword("Mc.1906");
	        
	        Student[] students = {student,student2};
	        StudentManager studentManager=new StudentManager();
	        studentManager.getList(students);
	}

}
