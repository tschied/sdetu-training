package oop;

public class StudentDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stud1 = new Student("Daniels","Jim", "712345567");
		Student stud2 = new Student("Walker","Jack", "123432467");
		Student stud3 = new Student("Beam","Jhonny", "455373367");
				
		stud1.setPhone("01234-673523");
		stud1.setState("California");
		stud1.setCity("L.A.");
		
		System.out.println(stud1.toString());
		
	}

}



class Student{
	private String name;
	private String surname;
	private String SSN;
	private String phone;
	private String city;
	private String state;
	private String userID;
	private static int ID = 1000;
	
	private String email;
	
	Student(String surname , String name , String SSN){
		this.name = name;
		this.surname = surname;
		this.SSN = SSN;
		email = name+"."+surname+"@udemy-university.com";
		ID++;
		int rint = (int)(1000 + 8000*Math.random());
		userID = "" + ID + rint + SSN.substring(SSN.length()-4,SSN.length());
		System.out.println(userID);
	}
	
	public void enroll() {
		System.out.println("Enrolling " + name + " " + surname);
	}
	
	public void pay() {
		System.out.println("Paying fee");
	}
	
	public void checkBalance() {
		System.out.println("Checking balance here...");
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Surname: " + surname + "]\n[userID: " + userID + "]\n[SSN: " + SSN  + "]\n[State: " + state + "]\n[City: " + city + "]\n[Phone: " + phone + "]\n[Email: " + email + "]";
	}
	
	public void showCourses() {
		System.out.println("Math\nMath\nMath again .. !!");
	}

	
	
	public String getPhone() {
		return phone;
	}	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}