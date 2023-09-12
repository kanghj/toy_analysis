package null_deref;

public class Fields {


	
	public void safe(String anotherString) {
		ObjectWithFields obj = new ObjectWithFields(1);
		// getNonNull does not return null. 
		// Click on "View Trace" or "View source code on GitHub" to check if nonNull was correctly initialized
		obj.getNonNull().compareTo(anotherString);
	}
	
	public void unsafe(String anotherString) {
		ObjectWithFields obj = new ObjectWithFields(1);
		obj.getNull().compareTo(anotherString);
	}
	
}
