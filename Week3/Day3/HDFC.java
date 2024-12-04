package week3.day3;

public class HDFC implements RBI {

	public static void main(String[] args) {
		HDFC hd=new HDFC();
		hd.mandatoryKYC();
		hd.depositLimit();

	}

	@Override
	public void mandatoryKYC() {
		System.out.println("Driving Licence");
		
	}

	@Override
	public void depositLimit() {
		System.out.println("5L to 10L");
		
	}

}
