package week3.day3;

public class SBI implements RBI {
	
	public void mandatoryKYC() {
		System.out.println("Adhaar Card");
		
	}

	
	public void depositLimit() {
	      System.out.println("1L to 10L");
		
	}

	public static void main(String[] args) {
		SBI sb=new SBI();
		sb.mandatoryKYC();
		sb.depositLimit();

	}
}
