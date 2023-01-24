package basics;

public class Weather {
	public static void main(String[] args){
		// Give suggestions on what to wear based on temperature
		int temperature = 50;
		String sunCondition = "Sunny";
		//String sunCondition = "Overcast";
		
		if(temperature>80) {
			System.out.println("Pleasant. Wear t-shirt.");
		}
		else if(temperature>60 && sunCondition == "Sunny") {
			System.out.println("Cooler. Perhaps wear longe-sleeve.");
			System.out.println("Take a hat.");
		}
		else if ( (temperature>50) || (sunCondition=="Overcast")) {
			System.out.println("Cold day. Dress warmly.");
		}
		else {
			System.out.println("Cold. Bring a sweater.");
		}
		
		System.out.println("Programm ending.");
	}
}
