package contact;

public class Contact {
	private String personName, personId;
	private int age;
	private String mobileNumber;
	private char gender;
	public Contact() {

	}
	public Contact(String personName, String personId, int age, String mobileNumber, char gender) {
		this.personName = personName;
		this.personId = personId;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
	}
	public void showPersonInfo() {
		System.out.println("ID: "+this.personId);
		System.out.println("Name: "+this.personName+"\t Age:"+this.age+"\t Gender: "+this.gender);
		System.out.println("Phone Number: "+this.mobileNumber);
	}
	public void detectMobileOperator() {
		
		if(this.mobileNumber.charAt(2)=='7') {
			System.out.println("GrameenPhone"); 
		}else if(this.mobileNumber.charAt(2)=='8') {
			System.out.println("Robi"); 
		}else if(this.mobileNumber.charAt(2)=='9') {
			System.out.println("Banglalink"); 
		}else if(this.mobileNumber.charAt(2)=='5') {
			System.out.println("TeleTalk"); 
		}else {
			System.out.println("Oh brother, you are using an operator which is out of this galaxy..!!"); 
		}
		
	}
}
