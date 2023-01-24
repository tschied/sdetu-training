package basics;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		System.out.println("*******************************");
		
		String[] countries;
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[1]);
		
		System.out.println("*******************************");
		
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		System.out.println("*******************************");
		
		int i = 0;
		
		do {
			System.out.println("State " + states[i]);
			i = i + 1;
		} while( i < 5 );
				
		System.out.println("*******************************");
		
		int n=0;
		boolean stateFound = false;
		while(n<4) {
//			System.out.println("States at "+n+": " + states[i]);
			String state = states[n];
			if(state == "Texas") {
				System.out.println("States Texas found.");
				stateFound = true;
			}
			n++;
		}
		
		System.out.println("*******************************");
		
		// for - loop
		for( int x=0 ; x<5 ; x++ ) {
			System.out.println("State " + states[x]);
		}
			
		
	}

}
