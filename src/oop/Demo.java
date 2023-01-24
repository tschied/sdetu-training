package oop;



class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}

	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
}





public class Demo {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "joe@me.co.uk";
		person1.phone = "016343782252";
		
		person1.walk();
		
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.email = "sarah@me.co.uk";
		person2.phone = "016354927462";
		
		person2.sleep();
		
		
		// Attributes, variables, adjectives, descriptors
//		String name = "Joe";
//		String email = "joe@me.co.uk";
//		String phone = "016343782252";
//		
//		System.out.println(name + " is walking");
//		System.out.println(name + " is eating");
//		walking(name);
//		
//		String name2 = "Joe";
//		String email2 = "joe@me.co.uk";
//		String phone2 = "016343782252";
	}
	
/*	static void walking(String name) {
		System.out.println(name + " is walking");
	}
*/
	
}
