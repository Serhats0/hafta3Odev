package hafta3Odev;

public class UserManager {
	public void Add(User user) {
		System.out.println("Kullan�c� : "+" "+user.getFirstName()+" "+user.getLastName()+" " +user.email+" "+" eklendi!");
	}
	
	public void Update(User user) {
		System.out.println("Kullan�c� : "+" "+user.getFirstName()+" "+user.getLastName()+" " +user.email+" "+" g�ncellendi!");
	}
	
	public void Delete(User user) {
		System.out.println("Kullan�c� : "+" "+user.getFirstName()+" "+user.getLastName()+" " +user.email+" "+" silindi!");
	}

}
