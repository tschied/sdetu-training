package datastructures;

public class Arrays {

	public static void main(String[] args) {
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		System.out.println("using length of variable alphabet:");
		for(int i=0;i<alphabet.length;i++)
		{
			System.out.println(alphabet[i]);
		}
		
		System.out.println("*************************");
		
		System.out.println("for-each - loop:");
		for(String letter : alphabet)
		{
			System.out.println(letter);
		}

		
		
		String[][] users = {{"John","Williams","jw@email.com","2672908022"},
							{"Sarah","Jackson","sj@email.com","3449853045"},
							{"Brian","Wallace","bw@email.com","5476340980"}};
		
		int nUsers = users.length;
		int nFields = users[0].length;
		System.out.println("Users: "+nUsers+" , Fields: "+nFields);
		
		// traverse the double array
		for(int i=0;i<nUsers;i++)
		{
				String firstName = users[i][0];
				String lastName = users[i][1];
				String email = users[i][2];
				String phone = users[i][3];
				System.out.println(lastName + " " + firstName + " " + email + " " + phone);
		}
		
		System.out.println("\n\nfor-each - loop:");
		
		for(String[] user : users)
		{
			System.out.print("[");
			for(String field : user)
				System.out.print(field + " ");
			System.out.println("]");
		}
		
	}

}
