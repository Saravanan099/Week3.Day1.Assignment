package Week3.Day1.Assignment4;

public class Students {

	public void getStudentInfo(int 	Id) {
		System.out.println("Student ID is: "  + Id);
	}
	
	public void getStudentInfo(int 	Id,String name) {
		System.out.println("Student ID is: " + Id  +" Name is: " + name);
	}
	
	public void getStudentInfo(String Email,String PhoneNumber) {
		System.out.println("Student Email is: " + Email + " and PhoneNumber is: "+ PhoneNumber);
	}

	public static void main(String[] args) {
		Students s=new Students();
		s.getStudentInfo(123);
		s.getStudentInfo(123,"Saravanan");
		s.getStudentInfo("Saravanan.btech10.prakasam@gmail.com","8072594901");
	}
	
}
