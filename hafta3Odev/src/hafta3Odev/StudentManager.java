package hafta3Odev;

public class StudentManager extends UserManager {
	public void getList(Student[] students) {
		for(Student student: students) {
			System.out.println("�grenci : "+" "+student.getFirstName()+" "+student.getLastName()+" " +student.email+" "+" eklendi!");
		}
		
	}

}
