package null_deref;

public class Fields2 {


	public void safe(String anotherString) {
		ObjectWithFields obj = new ObjectWithFields(5);	 
		obj.getNonNull().compareTo(anotherString);
	}
	
	public void safe2() {
		ObjectWithFields obj = new ObjectWithFields(10);	 
		obj.getNonNull().toString();
	}
	
	public void unsafe3() {
		ObjectWithFields obj = new ObjectWithFields(10);	 
		obj.getNullableValue().toString();
	}
	
	public void unsafe(String anotherString) {
		ObjectWithFields obj = new ObjectWithFields(5);
		obj.getNull().compareTo(anotherString);
	}
	
}
