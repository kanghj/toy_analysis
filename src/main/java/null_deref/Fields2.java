package null_deref;

public class Fields2 {


	public void safe(String anotherString) {
		ObjectWithFields obj = new ObjectWithFields(5);	 
		obj.getNonNull().compareTo(anotherString);
		// check the source code of `getNonNull` and the constructor of ObjectWithFields to determine if 
		// it is possible for getNonNull to return null;
	}
	
	public void safe2() {
		ObjectWithFields obj = new ObjectWithFields(10);
		obj.getNonNull().toString();
		// check the source code of `getNonNull` and the constructor of ObjectWithFields to determine if 
		// it is possible for getNonNull to return null;
	}
	
	public void unsafe3() {
		ObjectWithFields obj = new ObjectWithFields(10);	
		obj.getNullableValue().toString();
		// check the source code of `getNullableValue` and the constructor of ObjectWithFields to determine if 
		// it is possible for getNullableValue to return null;
	}
	
	public void unsafe(String anotherString) {
		ObjectWithFields obj = new ObjectWithFields(5);
		obj.getNull().compareTo(anotherString);
	}
	
	public void unsafe2(String anotherString) {
		ObjectWithFields obj = new ObjectWithFields(1);
		if (obj.getNull() == null) {
			obj.getNull().compareTo(anotherString);
		}
	}
	
}
