package homework2;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Are you ready to learn programming? Lets go");
		
		
		User user1 = new User(124545, "Azihan Zhamanakova", "student");
		
		UserManager userManager = new UserManager();
		userManager.addUser(user1); 
		
		User user2 =new User();
		user2.id = 56789;
		user2.fullName ="Mirbek Kerezbek";
		user2.socialStatus ="doctor";
		
	
		
		UserManager userManager2 = new UserManager();
		userManager2.addUser(user2);
		
		// veritabaninan bize veriler boyle gelir
		Course course1 = new Course(1, "Java Programming", 5000, 70);//instance olusturma
	
		
		
		Course course2 = new Course();//instance olusturma
		course2.id = 1;
		course2.name = "JavaScript";
		course2.totalHour = 70;
		course2.price = 4000;
		
		Course course3 = new Course();//instance olusturma
		course3.id = 1;
		course3.name = "C#";
		course3.totalHour = 70;
		course3.price = 7000;
		
	

		
		User[] users = new User [] {user1, user2};
		System.out.println("Sisteme giris yapan "+ users.length + " kullanici bulunmaktadir");
		System.out.println("Bunlar");
		for (User user: users) {
			System.out.println(user.id +"-" +user.fullName);
		}
		System.out.println("**********************");
		
		
		//for(Course course:courses) {
		//	System.out.println(course.name);
			
		//	CourseCategory category1 = new CourseCategory();
		//	category1.name ="Frontend";
			
		//	CourseCategory category2 = new CourseCategory();
		//	category2.name ="Backend";
			
		//}
		
		Course [] courses = {course1, course2, course3};// 1 tane kursumuz var
		System.out.println("Sistemde gozuken " + courses.length +  " tane kursumuz vardir");
		
		System.out.println("Bunlar:");
		for (Course course : courses) {
			System.out.println(course.id+"-"+course.name+"-"+course.totalHour + " saat ve fiyat " + course.price + " tl");			
		} 
		
		CouseManager couseManager = new CouseManager();
			couseManager.takeCourse(course2);
      
	

	}

}
