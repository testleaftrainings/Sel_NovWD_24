package week2.day1;

public class MethodWithReturnTypes {

	
	public String takePhoto() {
		return "jpeg,png,jpg";
	}
	
	public int checkAndroidVersion() {
		return 7;
	}
	
	public boolean checkCameraAvailableorNot() {
		return true;

	}

	
	public static void main(String[] args) {
		MethodWithReturnTypes mobileActions=new MethodWithReturnTypes();	
	    System.out.println(mobileActions.takePhoto());
	    //System.out.println(mobileActions.checkAndroidVersion());
	    //System.out.println(mobileActions.checkCameraAvailableorNot());
	}

}
