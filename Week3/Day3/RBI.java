package week3.day3;

public interface RBI {
	
	public void mandatoryKYC();
	
	public void depositLimit();
	
	//Implemented methods interface
	//static - This method cannot be overridden by implementation
	//Default - This method can be overridden by implementation class
	
	static void vehicleLoan() {
		
	} 
	
	default void HouseLoan() {
		
	}
	

}
