package null_deref;

public class Fields2 {


	public void safe(String anotherString) {
		ObjectWithFields obj = new ObjectWithFields(5);	
		// getNonNull does not return null. 
		// Click on "View Trace" or "View source code on GitHub" to check if nonNull was correctly initialized 
		obj.getNonNull().compareTo(anotherString);
	}
	
	public void safe2() {
		ObjectWithFields obj = new ObjectWithFields(10);	 
		obj.getNonNull().toString();
	}
	
	public void safe3() {
		ObjectWithFields obj = new ObjectWithFields(10);	 
		obj.getNullableValue().toString();
	}
	
	public void unsafe(String anotherString) {
		ObjectWithFields obj = new ObjectWithFields(5);
		obj.getNull().compareTo(anotherString);
	}
	
}
