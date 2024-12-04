package week3.day3;

public class ImplementationClass extends Axis{

	public static void main(String[] args) {
		ImplementationClass implementation=new ImplementationClass();
		implementation.mandatoryKYC();
		implementation.depositLimit();
		implementation.carLoan();
		implementation.goldLoan();

	}

	@Override
	public void mandatoryKYC() {
		System.out.println("DL");
		
	}

	@Override
	public void depositLimit() {
		System.out.println("15L");
		
	}

	@Override
	public void carLoan() {
		System.out.println("25L");
		
	}

}
