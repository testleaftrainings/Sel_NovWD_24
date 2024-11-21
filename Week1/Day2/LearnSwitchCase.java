package week1.day2;

public class LearnSwitchCase {

	public static void main(String[] args) {
		
		String browser="edge";
		
		switch(browser) {
		case "Chrome":
			System.out.println("Chrome browser executed");
			break;
			
		case "Edge":
		    System.out.println("Edge browser executed");
		    break;
		    
		    default:
		    	System.out.println("Chrome or Edge");
		}
		

	}

}
