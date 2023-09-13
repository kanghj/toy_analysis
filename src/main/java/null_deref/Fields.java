package null_deref;

public class Fields {


	
	public void safe(String anotherString) {
		ObjectWithFields obj = new ObjectWithFields(1);
		obj.getNonNull().compareTo(anotherString);
		// check the source code of `getNonNull` and the constructor of ObjectWithFields to determine if 
		// it is possible for getNonNull to return null; 
	}
	
	public void unsafe(String anotherString) {
		ObjectWithFields obj = new ObjectWithFields(1);
		obj.getNull().compareTo(anotherString);
	}
	
	public void unsafe2(String anotherString) {
		ObjectWithFields obj = new ObjectWithFields(1);
		if (obj.getNull() == null) {
			obj.getNull().equals(anotherString);
		}
	}
	
}
