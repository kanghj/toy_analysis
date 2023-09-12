package null_deref;

public class Fields {


	
	public void safe(String anotherString) {
		ObjectWithFields obj = new ObjectWithFields(1);
		obj.getNonNull().compareTo(anotherString);
	}
	
	public void unsafe(String anotherString) {
		ObjectWithFields obj = new ObjectWithFields(1);
		obj.getNull().compareTo(anotherString);
	}
	
}
