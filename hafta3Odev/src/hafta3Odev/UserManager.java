package hafta3Odev;

public class UserManager {
	public void Add(User user) {
		System.out.println("Kullanıcı : "+" "+user.getFirstName()+" "+user.getLastName()+" " +user.email+" "+" eklendi!");
	}
	
	public void Update(User user) {
		System.out.println("Kullanıcı : "+" "+user.getFirstName()+" "+user.getLastName()+" " +user.email+" "+" güncellendi!");
	}
	
	public void Delete(User user) {
		System.out.println("Kullanıcı : "+" "+user.getFirstName()+" "+user.getLastName()+" " +user.email+" "+" silindi!");
	}

}
